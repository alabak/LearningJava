public class baiqianbaiji {
    public static void main(String[] args){
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z=100-x-y;
                if((z%3==0)&&(5*x+3*y+z/3==100)){
                    System.out.println("公鸡数量是"+x+"母鸡的数量是"+y+"小鸡的数量是"+z);
                }
            }
        }
    }
}
