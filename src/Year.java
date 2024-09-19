public class Year {
    int normal_year;
    int leap_year;


    public Year (int normal_year,int leap_year){
        this.normal_year = normal_year;
        this.leap_year = leap_year;


    }


    public boolean is_leap_year(int year){
       if (year % 400 == 0){
           return true;
       } else if (year % 100 == 0) {
           return false;
       } else return year % 4 == 0;




    }



}
