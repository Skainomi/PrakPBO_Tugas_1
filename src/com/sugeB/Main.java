package com.sugeB;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> data = new HashMap<>();
    private static boolean inputDone = false;
    public final String[] DATA_NAME = {
            "nama",
            "nim",
            "usia",
            "nilaiUts",
            "nilaiUas"
    };
    private final String[] INPUT_NAME = {
            "NAMA : ",
            "NIM : ",
            "Usia : ",
            "Nilai UTS : ",
            "Nilai Uas : ",
            "Nilai Rata-Rata : "
    };
    Mahasiswa mahasiswa;

    public static void main(String[] args) {
        Main main = new Main();
        main.inputData();
        main.menu();
    }

    private void menu() {
        int input;
        boolean exit = false;
        do {
            System.out.println("Opsi=========");
            System.out.println("1. Tampilkan data");
            System.out.println("2. Edit data");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            input = scanner.nextInt();
            switch (input) {
                case 1 -> mahasiswa.outputDataMahasiswa();
                case 2 -> {
                    scanner.nextLine();
                    inputData();
                }
                case 3 -> exit = true;
            }
        } while (!exit);
    }

    private void inputData() {
        boolean passNilai;
        System.out.println("Input Data============");
        for (int i = 0; i < DATA_NAME.length; i++) {
            if (i > 1 && i < 5) {
                passNilai = false;
                do {
                    System.out.print(INPUT_NAME[i]);
                    data.put(DATA_NAME[i], scanner.nextLine());
                    try {
                        Integer.parseInt(data.get(DATA_NAME[i]));
                        if (Integer.parseInt(data.get(DATA_NAME[i])) > 100 || Integer.parseInt(data.get(DATA_NAME[i])) < 0) {
                            passNilai = false;
                            System.out.println("Please Input The Correct Number!");
                        } else {
                            passNilai = true;
                        }
                    } catch (Exception e) {
                        passNilai = false;
                        System.out.println("Input Error!, Please Input Number Value!");
                    }
                } while (!passNilai);
            } else {
                while (true) {
                    System.out.print(INPUT_NAME[i]);
                    data.put(DATA_NAME[i], scanner.nextLine());
                    if (data.get(DATA_NAME[i]).isEmpty()) {
                        System.out.println("Please Enter The Correct Data!");
                    } else {
                        break;
                    }
                }
            }
        }
        if (inputDone) {
            mahasiswa.setData(data);
        } else {
            mahasiswa = new Mahasiswa(data);
            inputDone = true;
        }
    }


}
