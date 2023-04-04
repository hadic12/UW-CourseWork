/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// The required calss
class Temperature{
    // the instace varaibles
    double temp;
    char scale;
    // non parametric constructor
    Temperature(){
        scale = 'C';
        temp = 0;
    }
    // parameteric constructor
    Temperature(double temp, char c){
        this.temp = temp;
        this.scale = c;
    }
    // accessors
    public double getCelcius(){
        // checks if the scale is celcius
        if(scale == 'C'){
            return temp;
        }
        else{
            // converts the temperature
            return ((9.00/5.00)*temp)+32;
        }
    }
    // accessors for getFahrenheit
    public double getFahrenheit(){
        if(scale == 'F'){
            return temp;
        }
        else{
            // converts the temperature
            return 5.00*(temp - 32)/9.00;
        }
    }

    public void setTemp(double temp){
        this.temp = temp;
    }


    public void setScale(char scale) {
        this.scale = scale;
    }
    // accessor
    public void setTempScale(double temp, char c){
        // sets the rescpecitve varibales
        this.temp = temp;
        this.scale = c;
    }
    // the compariosn method
    public int compareTo(Temperature obj){
        // checks if the temperatures are equal in celcius
        if(this.getCelcius()==obj.getCelcius()){
            return 0;
        }
        // checks if the temperature is lass than celcius
        else if(this.getCelcius()>obj.getCelcius()){
            return 1;
        }
        else{
            return -1;
        }
    }

    //Overrider
    public String toString() {
        return Math.round(temp * 10.0) / 10.0 + " " + scale;
    }

}