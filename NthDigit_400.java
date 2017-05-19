package LeetCode;

public class NthDigit_400 {
	public static void main(String[] args){
		int n = 1000000000;
		System.out.println(findNthDigit(n));
	}
	public static int findNthDigit(int n) {
        /*1~9 9���� 9*1=9��digit 
        10~99 90���� 90*2=180��digit 
        100~999 900���� 900*3=2700��digit 
        10^(k-1) ~ k��9���ɵ��� 9*10^(k-1)���� (9*10^(k-1))*k��digit
        
                     ֪��ÿ����λ�����ж��ٸ�����ȷ����n��digit�Ǽ�λ����Ȼ����ȷ�����Ǹ���λ�ĵڼ�������Ȼ��Ϳ���֪����n��digit�Ƕ�����
        */
        int k = 1 ;       //k������ʾ����λ������ʼ���Ǹ�λ��
        while(n/k >= 9*(int)Math.pow(10,k-1)){    //9*(int)Math.pow(10,k-1)*k�Ǹ��ݹ����Ƶ�����kλ��digit�����Ĺ�ʽ�������ر�ע�⣬֮���԰��ұߵ�*k�ŵ������Ϊ������������Ϊ��k=9ʱ��9*(int)Math.pow(10,k-1)*k=8100000000��������int������2^31=2147483647��Ϊ�˱�����һ���������k������ߣ���һ���ж����������˳�ѭ����
            n -= 9*(int)Math.pow(10,k-1)*k;       //ÿ�ζ�������С��λdigit��������ô��ÿ�ν���Ƚϵ�ǰ��λdigit����������ֱ�۵�ȷ����n��digit�ǲ��ǵ�ǰ��λ������digit�����磬��n=10����ôn>9(k=1)��˵��n�������ڸ�λ����digit����Ҫ��ʮλ��ȥ���ǣ����ȼ�����λ��digit����9����ô�õ�1��1<180(k=2)��˵����n��digitһ������ʮλ��
            k ++;         //����������λ
        }
        
        int result , remainder;
        result = n/k;          //n���ڱ�ʾ���ǵ�ǰ��λ���еĵ�n��digit�����Գ�����λk�󣬽���������ܵõ��ǵ�ǰ��λ�ĵڼ�����
        remainder = n%k;	   
        
        int prefig , behfig;   //����������ȷ��������digit������ǰһ������ĩβ��Ҳ�����ں�һ������
        prefig = (int)Math.pow(10,(k-1))+result-1;      //ǰһ�����ܺ�ȷ��
        if(remainder == 0)     //�������Ϊ0��ֱ�ӿ���˵��digit����ǰһ������ĩβ��ģ10���ɵõ�
            return prefig%10;
        else{
            behfig = prefig+1; //�õ���һ�����󣬺������뵽ת��ΪString�������Ǽ����Ͱѵڼ�λȡ������
            String s = String.valueOf(behfig);
            return s.charAt(remainder-1)-'0';
        }
        
    }
}
