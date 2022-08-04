System.out.println("Welcome to the memory game");
System.out.println("Enter the card number when asked");
System.out.println("Card number:");
board();
}
public static void board() {
int[][] cards = new int[5][5];
boolean upDown[][] = new boolean[5][5];
cards = randomizer(); //Shuffle cards       
System.out.println("     1 2 3 4 5 ");
System.out.println("---+---------");
for (int i = 0; i < 5; i++) {
System.out.print(" " + (i + 1) + " | ");
for (int a = 0; a < 5; a++) {
System.out.print("* ");
upDown[i][a] = false;
}
System.out.println();
}
System.out.println();
game(upDown, cards);
public static int[][] randomizer() {
int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int cards[][] = new int[5][5];
Random random = new Random();
int temp, t;
for (int j = 0; j<=30; j++) {
for (int x = 0; x<25; x++) {
t = random.nextInt(1000) % 20;
temp = num[x];
num[x] = num[t];
num[t] = temp;
}
t=0;
for(int r = 0; r < 5; r++)  
{
for(int s = 0; s < 5; r++)    
cards[r][s] = num[t]
t = t + 1;
}
}
}
return cards;
}
public static void game(boolean[][] upDown, int [][] cards) {
public static int[][] shuffle() {
int start = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int cards[][] = new int[5][5]
Random ran = new Random();
int tmp, i;
for (int s = 0; s<=30; s++) {
for (int x = 0; x<25; x++) {
i = ran.nextInt(100000) % 15;
tmp = start[x];
start[i] = start[x];
start[i] = tmp;
}
}
i = 0;
for (int r = 0; r < 5; r++)
{
for (int c = 0; c < 5; c++)
cards[r][c] = start[i];
i = i + 1;
}
}
return cards;
}
}
