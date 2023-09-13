public class Point{
    public double coordX;
    public double coordY;

    public double speedX;
    public double speedY;

    public double[] coord;

    /**
     * 
     * @param x position en x
     * @param y position en y
     * @param vX vitesse ajouté en x toutes les 5 millisecondes
     * @param vY vitesse ajouté en y toutes les 5 millisecondes
     */
    public Point(double x, double y, double vX, double vY) {
        this.coordX = x;
        this.coordY = y;   
        
        this.speedX = vX;
        this.speedY = vY;
    }

    /**
     * 
     * @return
     */
    public double[] getCoord(){
        double[] coord = {this.coordX, this.coordY};
        return coord;
    }

    /**
     * 
     * @param nwX nouvelle coordonées
     */
    public void setCoord(double nwCoord, int place){
        this.coord[place] = nwCoord;
    }

    public void setSpeedX(double nwSpeedX){
        this.speedX = nwSpeedX;
    }

    public void setSpeedY(double nwSpeedY){
        this.speedY = nwSpeedY;
    }

    public void move(){
        this.coordX += this.speedX;
        this.coordY += this.speedY;
    }
}
