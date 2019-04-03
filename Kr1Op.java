import java.io.*;

public class Kr1Op {
    public static void main(String[] args) {
        String [] numbers = splitLines();
        writeFile (numbers);
        String[] words = writeWords(numbers);
    }

    public static String[] splitLines() {
            String[] lines = new String[2];
            try {
                BufferedReader br = new BufferedReader(new FileReader("numbers.csv"));
                String line = br.readLine();
                lines = line.split(" ");
                String[] more_numbers = new String[lines.length];
                for (int i = 0; i < lines.length; i++) {
                    System.out.println(lines[i]);
                    more_numbers = lines[i].split(",");
                }
                for (int i = 0; i < more_numbers.length; i++) {
                    System.out.println(more_numbers[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
    }

    public static String[] writeWords(String[] numbers) {
        String[] words = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int a = Integer.parseInt(numbers[i]);
            while (a != 0) {
                if (numbers[i].length() == 2) {
                    if (a == 10) {
                        words[i] += "десять ";
                    }
                    words[i] += "надцять ";
                    if (numbers[i].length() == 1) {
                        if (a == 0) {
                            words[i] += " нуль";
                        }
                        if (a == 1) {
                            words[i] += " один";
                        }
                        if (a == 2) {
                            words[i] += " два";
                        }
                        if (a == 3) {
                            words[i] += " три";
                        }
                        if (a == 4) {
                            words[i] = " чотири";
                        }
                        if (a == 5) {
                            words[i] = " п'ять";
                        }
                        if (a == 6) {
                            words[i] = " шість";
                        }
                        if (a == 7) {
                            words[i] = " сім";
                        }
                        if (a == 8) {
                            words[i] = " вісім";
                        }
                        if (a == 9) {
                            words[i] = " дев'ять";
                        }

                    } else if (numbers[i].length() == 3) {

                    } else if (numbers[i].length() == 4) {

                    } else if (numbers[i].length() == 5) {

                    }
                }
            }
        }
        return words;
    }

    public static void writeFile (String[] words) {
        try {
            for(int i = 0; i < words.length; i++) {
                PrintWriter pr = new PrintWriter(new FileWriter("N.csv"));
                pr.write(words[i] + " ");
                pr.close();
            }
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println("Done");
    }

}
