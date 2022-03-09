class complex2 {
  int real;
  int image;
  public
          complex2(int p, int q){
              real=p;
              image=q;
          }
          void printcomplex(){
              System.out.println(real+"+"+image+"i");
              
          }
          static complex2 addcomplex(complex2 A, complex2 B){
             
              complex2 temp=new complex2(A.real+B.real, A.image+B.image);
              
              return temp;
          }
          static complex2 subcomplex(complex2 A, complex2 B){
             
              complex2 t=new complex2(A.real-B.real, A.image-B.image);
              
              return t;
          }
          static complex2 multicomplex(complex2 A, complex2 B){
             
              complex2 t=new complex2(A.real*B.real-A.image*B.image, A.real*B.image+A.image*B.real);
              
              return t;
          }
          
}

class driver{
    public static void main(String args[]){
        complex2 A = new complex2(2, 5);
        complex2 B= new complex2(4, 8);
        A.printcomplex();
        B.printcomplex();
        complex2 C=complex2.addcomplex(A, B);
        C.printcomplex();
        complex2 D=complex2.subcomplex(A, B);
        D.printcomplex();
      complex2 E=complex2.multicomplex(A, B);
      E.printcomplex();
        
    }
}
