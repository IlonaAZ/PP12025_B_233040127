package Pertemuan12;

public class ParsePost {
    private MyStack stack;
    private String input;

    public ParsePost(String input) {
        this.input = input;
        stack = new MyStack(20); // kapasitas stack
    }

    public int doParse() {
        char ch;
        int bil1, bil2, hasilOps = 0;

        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            
            // Skip spasi
            if (ch == ' ') {
                continue;
            }

            stack.displayStack("" + ch + " ");

            // Jika karakter adalah angka
            if (ch >= '0' && ch <= '9') {
                stack.push((int)(ch - '0')); // konversi char angka ke int
            } else {
                // Jika karakter adalah operator
                bil2 = (int) stack.pop();
                bil1 = (int) stack.pop();

                switch (ch) {
                    case '+':
                        hasilOps = bil1 + bil2;
                        break;
                    case '-':
                        hasilOps = bil1 - bil2;
                        break;
                    case '*':
                        hasilOps = bil1 * bil2;
                        break;
                    case '/':
                        hasilOps = bil1 / bil2;
                        break;
                    default:
                        System.out.println("Operator tidak dikenali: " + ch);
                        break;
                }

                stack.push(hasilOps);
            }
        }

        return (int) stack.pop(); // hasil akhir
    }
}
