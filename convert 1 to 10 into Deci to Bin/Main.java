class DecimalToBinary2 {
public static void main(String[] args) {
for (int num = 1; num <= 16; num++) {
int n = num;
int[] binaryNum = new int[32];
int i = 0;
while (n > 0) {
binaryNum[i] = n % 2;
n = n/2;
i++;
}
System.out.print("Decimal: " + num + " Binary: ");
for (int j = 1; j>= 0; j--) {
System.out.print(binaryNum[j]);
}
System.out.println();
}
}
}