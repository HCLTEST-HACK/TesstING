package hanndson;

public class TowerOfHanoi1 {

	static void towerOfHanoi(int n, String from_rod, String to_rod, String mid_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, mid_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi(n-1, mid_rod, to_rod, from_rod); 
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 4; // Number of disks 
        towerOfHanoi(n, "Left", "Right", "Midle");
       // towerOfHanoi(n, \'A\', \'C\', \'B\'); 
        		// A, B and C are names of rods 
    } 
}
