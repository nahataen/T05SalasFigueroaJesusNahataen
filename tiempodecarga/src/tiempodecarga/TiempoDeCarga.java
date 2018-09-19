package tiempodecarga;
public class TiempoDeCarga {
public static void main(String[] args) {
long startTime = System.currentTimeMillis();
int suma = 0;
for (int i = 0; i <=1000000; i++) {	suma+=i;}
long endTime = System.currentTimeMillis() - startTime;
System.out.println("La suma es:"+suma+" TIEMPO DE CARGA="+endTime+" milisegundos");}
}
