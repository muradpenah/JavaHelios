package lesson4.Homework;

import java.util.Scanner;

public class Student_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX_STUDENTS = 100;
        String[] names = new String[MAX_STUDENTS];
        int[] ages = new int[MAX_STUDENTS];
        double[] grades = new double[MAX_STUDENTS];
        char[] letterGrades = new char[MAX_STUDENTS];
        boolean[] passedStatus = new boolean[MAX_STUDENTS];
        int studentCount = 0;
        int choice;
        do {
            System.out.println("\n=============================================");
            System.out.println("Tələbə İdarəetmə Sisteminizə Xoş Gəlmisiniz");
            System.out.println("=============================================");
            System.out.println("\n\n==================== MENYU ====================");
            System.out.println("1.  Yeni Tələbə Qeydiyyatı");
            System.out.println("2.  Bütün Tələbələri Göstər (Cəmi: " + studentCount + ")");
            System.out.println("3.  Sinif Statistikaları");
            System.out.println("4.  Tələbə Axtarışı (Ada görə)");
            System.out.println("5.  Yaş Aralığına görə Filtr");
            System.out.println("6.  Keçid Statusuna görə Filtr");
            System.out.println("7.  Qiymətə görə Sıralama");
            System.out.println("0.  Çıxış");
            System.out.println("=============================================");
            System.out.print("Seçiminizi daxil edin: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (studentCount >= MAX_STUDENTS) {
                        System.out.println("\n Qeydiyyat Tamamlandı! Maksimum tələbə sayına çatıldı.");
                    } else {
                        System.out.println("\n--- Tələbə Qeydiyyatı ---");
                        System.out.print("Tələbə Adı: ");
                        names[studentCount] = sc.nextLine();
                        System.out.print("Yaş: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Xəta! Yaş rəqəm olmalıdır. Yenidən daxil edin: ");
                            sc.nextLine();
                        }
                        ages[studentCount] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Qiymət (0.0-100.0): ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Xəta! Qiymət rəqəm olmalıdır. Yenidən daxil edin: ");
                            sc.nextLine();
                        }
                        double grade = sc.nextDouble();
                        grades[studentCount] = grade;
                        sc.nextLine();
                        if (grade >= 90) {
                            letterGrades[studentCount] = 'A';
                        } else if (grade >= 80) {
                            letterGrades[studentCount] = 'B';
                        } else if (grade >= 70) {
                            letterGrades[studentCount] = 'C';
                        } else if (grade >= 60) {
                            letterGrades[studentCount] = 'D';
                        } else {
                            letterGrades[studentCount] = 'F';
                        }
                        passedStatus[studentCount] = (grade >= 60.0) ? true : false;
                        System.out.println("\n " + names[studentCount] + " qeydiyyatdan keçdi.");
                        System.out.println("Hərf Qiyməti: " + letterGrades[studentCount] + ", Status: " + (passedStatus[studentCount] ? "KEÇDİ" : "QALDI"));
                        studentCount++;
                    }
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("\n Sistemdə qeydiyyatdan keçmiş tələbə yoxdur.");
                    } else {
                        System.out.println("\n====================== TƏLƏBƏ SİYAHISI ======================");
                        System.out.printf("%-5s | %-20s | %-5s | %-7s | %-5s | %s\n", "№", "Ad", "Yaş", "Qiymət", "Hərf", "Status");
                        System.out.println("-------------------------------------------------------------");

                        for (int i = 0; i < studentCount; i++) {
                            System.out.printf("%-5d | %-20s | %-5d | %-7.2f | %-5c | %s\n",
                                    i + 1, names[i], ages[i], grades[i], letterGrades[i],
                                    passedStatus[i] ? "KEÇDİ" : "QALDI");
                        }
                    }
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 3:
                    if (studentCount == 0) {
                        System.out.println("\n Statistikaları hesablamaq üçün tələbə yoxdur.");
                    } else {

                        double totalGrade = 0;
                        int totalAge = 0;
                        double maxGrade = grades[0];
                        double minGrade = grades[0];
                        int passedCount = 0;

                        for (double grade : grades) {
                            if (grade == 0 && totalGrade > 0 && totalAge == 0) continue;
                            totalGrade += grade;
                        }
                        for (int i = 0; i < studentCount; i++) {
                            totalAge += ages[i];
                            if (grades[i] > maxGrade) {
                                maxGrade = grades[i];
                            }
                            if (grades[i] < minGrade) {
                                minGrade = grades[i];
                            }

                            if (passedStatus[i]) {
                                passedCount++;
                            }
                        }
                        double averageGrade = totalGrade / studentCount;
                        double averageAge = (double) totalAge / studentCount;
                        int failedCount = studentCount - passedCount;

                        System.out.println("\n==================== SİNİF STATİSTİKALARI ===================");
                        System.out.println(" Orta Qiymət: \n" + averageGrade);
                        System.out.println(" Ən Yüksək Qiymət: \n" + maxGrade);
                        System.out.println(" Ən Aşağı Qiymət: \n" + minGrade);
                        System.out.println(" Orta Yaş: \n" + averageAge);
                        System.out.println(" Keçən Tələbələrin Sayı: " + passedCount);
                        System.out.println(" Qalan Tələbələrin Sayı: " + failedCount);
                        System.out.println("=============================================================");
                    }
                    break;
                case 4:
                    if (studentCount == 0) {
                        System.out.println("\n Axtarış etmək üçün tələbə yoxdur.");
                    } else {

                        System.out.print("\n Axtarılacaq tələbənin adını daxil edin: ");
                        String searchName = sc.nextLine().trim().toLowerCase();
                        int cCount = 0;

                        System.out.println("\n--- Axtarış Nəticələri ---");

                        for (int i = 0; i < studentCount; i++) {
                            if (names[i].toLowerCase().contains(searchName)) {
                                System.out.printf("%-5d | %-20s | %-5d | %-7.2f | %-5c | %s\n",
                                        i + 1, names[i], ages[i], grades[i], letterGrades[i],
                                        passedStatus[i] ? "KEÇDİ" : "QALDI");
                                cCount++;
                            }
                        }

                        if (cCount == 0) {
                            System.out.println(" " + searchName + " adına uyğun tələbə tapılmadı.");
                        } else {
                            System.out.println(" Cəmi " + cCount + " nəticə tapıldı.");
                        }
                    }
                    break;
                case 5:
                    if (studentCount == 0) {
                        System.out.println("\n Filtrasiya etmək üçün tələbə yoxdur.");
                        return;
                    }

                    System.out.print("\n Minimum yaşı daxil edin: ");
                    while (!sc.hasNextInt()) {
                        System.out.println(" Xəta! Yaş rəqəm olmalıdır. Yenidən daxil edin: ");
                        sc.nextLine();
                    }
                    int minAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Maksimum yaşı daxil edin: ");
                    while (!sc.hasNextInt()) {
                        System.out.println(" Xəta! Yaş rəqəm olmalıdır. Yenidən daxil edin: ");
                        sc.nextLine();
                    }
                    int maxAge = sc.nextInt();
                    sc.nextLine();
                    if (minAge > maxAge || minAge < 0) {
                        System.out.println(" Yaş aralığı düzgün daxil edilməyib!");
                        return;
                    }

                    int foundCount = 0;

                    System.out.println("\n--- Yaş Aralığı (" + minAge + "-" + maxAge + ") Üzrə Nəticələr ---");
                    for (int i = 0; i < studentCount; i++) {
                        if (ages[i] >= minAge && ages[i] <= maxAge) {
                            System.out.printf("%-5d | %-20s | %-5d | %-7.2f | %-5c | %s\n",
                                    i + 1, names[i], ages[i], grades[i], letterGrades[i],
                                    passedStatus[i] ? "KEÇDİ" : "QALDI");
                            foundCount++;
                        }
                    }

                    if (foundCount == 0) {
                        System.out.println(" Bu yaş aralığına uyğun tələbə tapılmadı.");
                    } else {
                        System.out.println(" Cəmi " + foundCount + " nəticə tapıldı.");
                    }
                    break;
                case 6:
                    if (studentCount == 0) {
                        System.out.println("\n Filtrasiya etmək üçün tələbə yoxdur.");
                    } else {

                        System.out.print("\n Statusu daxil edin (1: Keçən, 2: Qalan): ");
                        while (!sc.hasNextInt()) {
                            System.out.println(" Xəta! Seçim rəqəm olmalıdır. Yenidən daxil edin: ");
                            sc.nextLine();
                        }
                        int statusChoice = sc.nextInt();
                        sc.nextLine();

                        boolean filterStatus;


                        switch (statusChoice) {
                            case 1:
                                filterStatus = true;
                                break;
                            case 2:
                                filterStatus = false;
                                break;
                            default:
                                System.out.println(" Yanlış seçim! 1 (Keçən) və ya 2 (Qalan) daxil edin.");
                                return;
                        }

                        int fCount = 0;

                        System.out.println("\n--- " + (filterStatus ? "Keçən" : "Qalan") + " Tələbələr ---");
                        for (int i = 0; i < studentCount; i++) {
                            if (passedStatus[i] == filterStatus) {
                                System.out.printf("%-5d | %-20s | %-5d | %-7.2f | %-5c | %s\n",
                                        i + 1, names[i], ages[i], grades[i], letterGrades[i],
                                        passedStatus[i] ? "KEÇDİ" : "QALDI");
                                fCount++;
                            }
                        }

                        if (fCount == 0) {
                            System.out.println(" Bu statusa uyğun tələbə tapılmadı.");
                        } else {
                            System.out.println(" Cəmi " + fCount + " nəticə tapıldı.");
                        }
                    }
                    break;
                case 7:
                    System.out.println("NaN --- Gələcəkdə bu funksiya əlavə ediləcək. Uğurlar! ---");
                    break;
                case 0:
                    System.out.println("\n Çıxış edildi... Proqram dayandırıldı. Uğurlar!");
                    break;
                default:
                    System.out.println("\n Yanlış seçim! Zəhmət olmasa, menyudan düzgün seçim edin.");
            }

        } while(choice !=0);
        }
    }

