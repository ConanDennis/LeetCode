package LeetCode;

public class RectangleArea_223 {
	public static void main(String[] args){
		int A = -5, B = -2, C = 5, D = 1, E = -3, F = -3, G = 3, H = 3;
		System.out.println(computeArea(A, B, C, D, E, F, G, H));
	}
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int S1, S2, overlap=0 ;
        S1 = (D - B) * (C - A);
        S2 = (H - F) * (G - E);
        
        if(B<=H && B>=F && D>=H && C>=E && C<=G && A<=E)
            overlap = (C - E) * (H - B);
        else if(B<=H && B>=F && D>=H && A>=E && C<=G)
            overlap = (C - A) * (H - B);
        else if(B<=H && B>=F && D>=H && A>=E && A<=G && C>=G)
            overlap = (G - A) * (H - B);
            
        else if(D<=H && B>=F && C>=E && C<=G && A<=E)
            overlap = (C - E) * (D - B);
        else if(D<=H && B>=F && A>=E && C<=G)
            overlap = (C - A) * (D - B);
        else if(D<=H && B>=F && A>=E && A<=G && C>=G)
            overlap = (G - A) * (D - B);
            
        else if(D<=H && D>=F && B<=F && C>=E && C<=G && A<=E)
            overlap = (C - E) * (D - F);
        else if(D<=H && D>=F && B<=F && A>=E && C<=G)
            overlap = (C - A) * (D - F);
        else if(D<=H && D>=F && B<=F && A>=E && A<=G && C>=G)
            overlap = (G - A) * (D - F);
            
        else if(E>=A && G<=C && F>=B && F<=D && H>=D)
            overlap = (G - E) * (D - F);
        else if(E>=A && G<=C && F>=B && H<=D)
            overlap = (G - E) * (H - F);
        else if(E>=A && G<=C && H>=B && H<=D && F<=B)
            overlap = (G - E) * (H - B);
        else if(G>=A && G<=C && E<=A && F>=B && H<=D)
            overlap = (G - A) * (H - F);
        else if(E>=A && E<=C && G>=C && F>=B && H<=D)
            overlap = (C - E) * (H - F);
        
        else if(E>=A && G<=C && H>=D && F<=B)
            overlap = (G - E) * (D - B);
        else if(A>=E && C<=G && D>=H && B<=F)
            overlap = (C - A) * (H - F);
        
        return S1+S2-overlap;
    }
}
