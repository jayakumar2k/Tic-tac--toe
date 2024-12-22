import java.util.*;
public class XO {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       String[][]a=new String[3][3];
       int num=1;
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=Integer.toString(num++);
        }
       }
      
       display(a);

       gameInp(a);
    }
    public static boolean iC(String[] a){
        for(int i=0;i<a.length;i++){
            if(!a[i].equals("0")){
                return true;
            }
        }
        return false;
    }

    public static void gameInp(String[][]a){
        String[] check={"1","2","3","4","5","6","7","8","9"};
        int count=0;
    
    for(int i=0;i<9;i++){
        count++;
        if(i%2==0){
        System.out.print("Enter a slot number to place X in:");
        String xin= sc.nextLine();
        switch (xin) {
            case "1":
                {
                boolean flag=false;
                for(int i1=0;i1<check.length;i1++){
                    if(check[i1].equals(xin)){
                    a[0][0]="X";
                    check[i1]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[0].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "2":
                {
                boolean flag=false;
                for(int i2=0;i2<check.length;i2++){
                    if(check[i2].equals(xin)){
                    a[0][1]="X";
                    check[i2]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[1].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                
                break;                
                }
            case "3":
                {
                    boolean flag=false;
                for(int i3=0;i3<check.length;i3++){
                    if(check[i3].equals(xin)){
                    a[0][2]="X";
                    check[i3]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[2].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                
                break;                
                }
            case "4":
                {
                    boolean flag=false;
                for(int i4=0;i4<check.length;i4++){
                    if(check[i4].equals(xin)){
                    a[1][0]="X";
                    check[i4]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[3].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                
                break;                
                }
            case "5":
                {
                    boolean flag=false;
                for(int i5=0;i5<check.length;i5++){
                    if(check[i5].equals(xin)){
                    a[1][1]="X";
                    check[i5]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[4].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "6":
                {
                    boolean flag=false;
                for(int i6=0;i6<check.length;i6++){
                    if(check[i6].equals(xin)){
                    a[1][2]="X";
                    check[i6]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[5].equals("0")&& flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "7":
                {
                    boolean flag=false;
                for(int i7=0;i7<check.length;i7++){
                    if(check[i7].equals(xin)){
                    a[2][0]="X";
                    check[i7]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[6].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
                case "8":
                {
                    boolean flag=false;
                for(int i8=0;i8<check.length;i8++){
                    if(check[i8].equals(xin)){
                    a[2][1]="X";
                    check[i8]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[7].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "9":
                {
                    boolean flag=false;
                for(int i9=0;i9<check.length;i9++){
                    if(check[i9].equals(xin)){
                    a[2][2]="X";
                    check[i9]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[8].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            default:{
                System.out.println("Please enter a correct input");
                i--;
                count--;
                break;
            }

        }
    }
    else{
        System.out.print("Enter a slot number to place O in:");
        String xin= sc.nextLine();
        switch (xin) {
            case "1":
                {
                boolean flag=false;
                for(int j1=0;j1<check.length;j1++){
                    if(check[j1].equals(xin)){
                    a[0][0]="O";
                    check[j1]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[0].equals("0")&& flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "2":
                {
                boolean flag=false;
                for(int j2=0;j2<check.length;j2++){
                    if(check[j2].equals(xin)){
                    a[0][1]="O";
                    check[j2]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[1].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "3":
                {
                boolean flag=false;
                for(int j3=0;j3<check.length;j3++){
                    if(check[j3].equals(xin)){
                    a[0][2]="O";
                    check[j3]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[2].equals("0")&& flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "4":
                {
                boolean flag=false;
                for(int j4=0;j4<check.length;j4++){
                    if(check[j4].equals(xin)){
                    a[1][0]="O";
                    check[j4]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[3].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "5":
                {
                boolean flag=false;
                for(int j5=0;j5<check.length;j5++){
                    if(check[j5].equals(xin)){
                    a[1][1]="O";
                    check[j5]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[4].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "6":
                {
                boolean flag=false;
                for(int j6=0;j6<check.length;j6++){
                    if(check[j6].equals(xin)){
                    a[1][2]="O";
                    check[j6]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[5].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "7":
                {
                boolean flag=false;
                for(int j7=0;j7<check.length;j7++){
                    if(check[j7].equals(xin)){
                    a[2][0]="O";
                    check[j7]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[6].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
                case "8":
                {
                boolean flag=false;
                for(int j8=0;j8<check.length;j8++){
                    if(check[j8].equals(xin)){
                    a[2][1]="O";
                    check[j8]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[7].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            case "9":
                {
                boolean flag=false;
                for(int j9=0;j9<check.length;j9++){
                    if(check[j9].equals(xin)){
                    a[2][2]="O";
                    check[j9]="0";
                    flag=true;
                    break;
                    }
                }
                if(check[8].equals("0") && flag==false){
                System.out.println("Slot is already filled");
                i--;
                count--;
                }

                String res=check(a);
                if(res.equals("x wins")){
                    display(a);
                    i=8;
                    System.out.println("X wins");
                    break;
                }
                else if(res.equals("o wins")){
                    display(a);
                    i=8;
                    System.out.println("O wins");
                    break;
                }
                display(a);
                if(!iC(check)){
                    i=8;
                    break;
                }
                break;                
                }
            default:{
                System.out.println("Please enter a correct input");
                i--;
                count--;
                break;
            }

        }


    }
    }
    if(count==9){
    System.out.println("Draw");
    }
    }

    public static void display(String[][]a){
        for(int i=0;i<a.length;i++){
            System.out.print("|");
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("|");
            System.err.println();
           }
    }
    public static String check(String[][]a){
        for(int i=0;i<8;i++){
            String line="";
            switch (i) {
                case 0:{
                    line=a[0][0]+a[0][1]+a[0][2];
                    break;
                }
                case 1:{
                    line=a[1][0]+a[1][1]+a[1][2];
                    break;
                }
                case 2:{
                    line=a[2][0]+a[2][1]+a[2][2];
                    break;
                }
                case 3:{
                    line=a[0][0]+a[1][1]+a[2][2];
                    break;
                }
                case 4:{
                    line=a[0][2]+a[1][1]+a[2][0];
                    break;
                }
                case 5:{
                    line=a[0][0]+a[1][0]+a[2][0];
                    break;
                }
                case 6:{
                    line=a[0][1]+a[1][1]+a[2][1];
                    break;
                }
                case 7:{
                    line=a[0][2]+a[1][2]+a[2][2];
                    break;
                }

            }
            if(line.equals("XXX")){
                return "x wins";
            }
            else if(line.equals("OOO")){
                return "o wins";          
            }
        }
        return "no";
        
    }
}
