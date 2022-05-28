
public class Position
{
   private double x, y;

   public Position(double pos[])
   {
      this.x = pos[0];
      this.y = pos[1];
   }

   public Position(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX() { return x; }
   public double getY() { return y; }

   public double getDistanceTo(Position p)
   {
      return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
   }

   // Bearing to another position, realtive to 'North'
   // Bearing have several meanings, in this case the angle between
   // north and the position p.
   public double getBearingTo(Position p)
   {
      return Math.atan2(p.y - y, p.x - x);
   }
}
