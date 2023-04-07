import java.util.Arrays;

public class PRO_공원산책 {

	public static void main(String[] args) {
		String[] park = {"OSO","OOO","OXO","OOO"};
		
		String[][] parkMap;
        int h = park.length;
        int w = park[0].length();
        parkMap = new String[w][h];
        
        int row = 0;
        for(String s : park){
        	int col = 0;
            while(col < w){
                parkMap[row][col] = Character.toString( s.charAt(col));
                col++;
            }
            row++;
            
        }
        System.out.println(park[0]);
        System.out.println(Arrays.toString(park));
        System.out.println(Arrays.deepToString(parkMap));
		
		
	}

}
