public class NarrasticNumber{
    public static void main(String[] args){
        int count=0;
        for(int nums=100;nums<1000;nums++){
            int a=nums%10;
            int b=nums/10%10;
            int c=nums/100%10;
            if(nums==(a*a*a)+(b*b*b)+(c*c*c)) {
                System.out.println("ˮ�ɻ���Ϊ" + nums + ",��λΪ" + a + ",ʮλΪ" + b + ",��λΪ" + c);
                count++;
            }
        }
        System.out.println("һ����"+count+"��ˮ�ɻ���");
    }
}
