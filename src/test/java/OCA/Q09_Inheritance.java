package OCA;

 class Q09_Inheritance {
    int r;

    Q09_Inheritance(){

    }

    Q09_Inheritance (int r){
        this.r=r;
    }
}

class DVD extends Q09_Inheritance{
     int c;
     DVD(int r,int c){
         super(r);
         this.c=c;

     }

    public static void main(String[] args) {
        DVD dvd=new DVD(10,20);
        System.out.println(dvd);
        System.out.println(dvd.c);
    }
}
