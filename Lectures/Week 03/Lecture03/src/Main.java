void main(String[] args){
    float a = 6f;
    float b = -5f;

    //Arimetic operators
    /*double c = a + b;
    System.out.println(c);*/

    //Boolean operators
    boolean c = a > b;
    System.out.println(c);

    //Example
    float sum = 74 / 10 % 2 * 5 - 10 % ( 5 - 1 );
    System.out.println(sum);

    //Logical operators
    boolean truth = true;
    boolean falsee = false;

    System.out.println(truth && falsee);
    System.out.println(truth || falsee);
    System.out.println(!truth || falsee);

    //Exercise one
    int x = 2;
    int y = 6;
    int z = 3;
    System.out.println((x > z) && (y > z));
    System.out.println((x <= 5) ||( y > 2 )|| (z == 6));
    System.out.println(x ==2);
    System.out.println((x == 3|| ((y > 5) && (z > 2))));
}