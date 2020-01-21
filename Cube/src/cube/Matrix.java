
package cube;

import static cube.ColorsANSI.ANSI_BLUE;
import static cube.ColorsANSI.ANSI_GREEN;
import static cube.ColorsANSI.ANSI_RED;
import static cube.ColorsANSI.ANSI_RESET;
import java.util.Random;


public class Matrix {
    
    public void alfabeto(int l ,int c){
        Random rand = new Random();
        char[][] matrix = new char[l][c];
        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                matrix [i][j]+= alphabet[rand.nextInt(26)];
            }
        }
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                if(j<c-1)System.out.print(matrix [i][j]+"|");
                else if(j==c-1)System.out.print(matrix [i][j]);
            }
            System.out.println("");
        }
        
    }
    
    public void square(int l,int c){
        Random rand = new Random();
        
        int [][] matrix = new int[l][c];
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                int n;
                matrix [i][j]+= n = rand.nextInt(10);
            }
        }
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                if(j<c-1)System.out.print(matrix [i][j]+"|");
                else if(j==c-1)System.out.print(matrix [i][j]);
            }
            
            System.out.println("");
        }
    }
    
    public void squarebin(int l,int c){
        Random rand = new Random();
        
        int [][] matrix = new int[l][c];
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                int n;
                matrix [i][j]+= n = rand.nextInt(2);
            }
        }
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                if(j<c-1)System.out.print(matrix [i][j]+"|");
                else if(j==c-1)System.out.print(matrix [i][j]);
            }
            
            System.out.println("");
        }
    }
    
    public void cube(int l,int c,int p){
        Random rand = new Random();
        
        int [][][] matrix = new int[l][c][p];
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                for(int x=0;x<p;x++){
                    int n;
                    matrix [i][j][x]+= n = rand.nextInt(10);
                }
            }
        }
        
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                for(int x=0;x<p;x++){
                    int s = 0;
                    s+= x;
                    if(s==0)System.out.print(matrix [i][j][x]);
                    else if(x==s)System.out.print(ANSI_RED+matrix [i][j][x]+ANSI_RESET);
                    //else if(i==l-1)System.out.print(ANSI_BLUE+matrix [i][j][x]+ANSI_RESET);
                
                
                }    
            }
            
            System.out.println("");
        }
        
    }
    
    public void vetor4d(int a,int b,int c,int tempo,int vartempo,int valinicial,int valfinal){
        Random rand = new Random();
        
        int [][][] matrix = new int [a][b][c];
        
        for(int c1=0;c1<a;c1++){
            for(int c2=0;c2<b;c2++){
                for(int c3=0;c3<c;c3++){
                                            
                        matrix [c1][c2][c3] = valinicial;  
                    
                }    
            }
        }
        for(int t = 0;t<=tempo;t++){
            System.out.println("");
            System.out.println(ANSI_GREEN+"-----(TEMPO:"+(t)+")-----\n"+ANSI_RESET);
        
            for(int c1=0;c1<a;c1++){
                for(int c2=0;c2<b;c2++){
                    for(int c3=0;c3<c;c3++){
                        
                        matrix [c1][c2][c3] += vartempo;
                        
                        if(matrix [c1][c2][c3]>=valfinal || matrix [c1][c2][c3]<valinicial){
                            matrix [c1][c2][c3]=valinicial;
                        }else if(t==0){
                            matrix [c1][c2][c3]=valinicial;
                        }
                    
                   
                        if(c3==0)System.out.print(matrix [c1][c2][c3]);
                        else if(c3<c-1)System.out.print(ANSI_RED+matrix [c1][c2][c3]+ANSI_RESET);
                        else if(c3<c)System.out.print(ANSI_BLUE+matrix [c1][c2][c3]+" "+ANSI_RESET);
                        
                    
                    }
                } 
                System.out.println("");
            }
            
        }
        System.out.println("");
    }
    
    public void vetor10d(int a, int b, int c, int d , int e, int f, int g, int h, int i, int j){//nao funciona
        
        Random rand = new Random();
        
        int [][][][][][][][][][] matrix = new int [a][b][c][d][e][f][g][h][i][j];
        
        for(int c1=0;c1<a;c1++){
            for(int c2=0;c2<b;c2++){
                for(int c3=0;c3<c;c3++){
                    for(int c4=0;c4<d;c4++){
                        for(int c5=0;c5<e;c5++){
                            for(int c6=0;c6<f;c6++){
                                for(int c7=0;c7<g;c7++){
                                    for(int c8=0;c8<h;c8++){
                                        for(int c9=0;c9<i;c9++){
                                            for(int c10=0;c10<j;c10++){
                                                int n;
                                                matrix [a][b][c][d][e][f][g][h][i][j]+= n = rand.nextInt(10);  
                                            }
                                        }
                                    }
                                }   
                            }
                        }
                    }
                }
            }
        }
        
        for(int c1=0;c1<a;c1++){
            for(int c2=0;c2<b;c2++){
                for(int c3=0;c3<c;c3++){
                    for(int c4=0;c4<d;c4++){
                        for(int c5=0;c5<e;c5++){
                            for(int c6=0;c6<f;c6++){
                                for(int c7=0;c7<g;c7++){
                                    for(int c8=0;c8<h;c8++){
                                        for(int c9=0;c9<i;c9++){
                                            for(int c10=0;c10<j;c10++){
                                                if(c10<j-1)System.out.print(matrix [a][b][c][d][e][f][g][h][i][j]+"|");
                                                else if(c10==j-1)System.out.print(matrix [a][b][c][d][e][f][g][h][i][j]);                                                  
                                            }
                                        }
                                    }
                                }   
                            }
                        }
                    }
                }
            }
            System.out.println("");
        }
        
        
      
        
    }

   

    
}
