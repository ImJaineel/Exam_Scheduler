import java.util.Scanner;
class Exam_scheduler
{
    public static void main(String args[])
    {
        int q=1;
        while(q!=0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Computer Science");
            System.out.println("2. Mechanical");
            System.out.println("3. Mechatronics ");
            System.out.println("4. biotech");
            System.out.println("5. BioMedical");
            System.out.println("Select your branch");
            int br=sc.nextInt();

            int x;
            String cs[][]=new String[6][7];
            String mec[][]=new String[6][7];
            String mx[][]=new String[6][7];
            String bt[][]=new String[6][7];
            String bm[][]=new String[6][7];
            if(br==1)
            {
                System.out.println("Enter no. of Subjects ");
                int l=sc.nextInt();
                int b;
                String Sub;
                int date;
                String date1="1. 11-04-2021";
                String date2="2. 12-04-2021";
                String date3="3. 13-04-2021";
                String date4="4. 14-04-2021";
                String date5="5. 15-04-2021";
                String slot1="1. slot- 11:30-12:30";
                String slot2="2. slot- 12:30-13:30";
                String slot3="3. slot- 13:30-14:30";
                String slot4="4. slot- 14:30-15:30";
                String slot5="5. slot- 15:30-16:30";
                String slot6="6. slot- 16:30-17:30";
                cs[0][0]="date/time";
                cs[1][0]="11-04-2021";
                cs[2][0]="12-04-2021";
                cs[3][0]="13-04-2021";
                cs[4][0]="14-04-2021";
                cs[5][0]="15-04-2021";
                cs[0][1]="11:30-12:30";
                cs[0][2]="12:30-13:30";
                cs[0][3]="13:30-14:30";
                cs[0][4]="14:30-15:30";
                cs[0][5]="15:30-16:30";
                cs[0][6]="16:30-17:30";
                for(int i=1;i<6;i++)
                {
                    for(int j=1;j<7;j++)
                    {
                        cs[i][j] = "not scheduled";
                    }
                }
                for(int i=0;i<l;i++)
                {
                    System.out.println("Enter name of Subject ");
                    Sub=sc.next();
                    System.out.println("Following are the dates for exam. Please select one...");
                    System.out.println(date1);
                    System.out.println(date2);
                    System.out.println(date3);
                    System.out.println(date4);
                    System.out.println(date5);
                    date=sc.nextInt();
                    if(date == 1)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(cs[1][1] == "not scheduled")
                                cs[1][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(cs[1][2] == "not scheduled")
                                cs[1][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(cs[1][3] == "not scheduled")
                                cs[1][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(cs[1][4] == "not scheduled")
                                cs[1][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(cs[1][5] == "not scheduled")
                                cs[1][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(cs[1][6] == "not scheduled")
                                cs[1][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 2)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(cs[2][1] == "not scheduled")
                                cs[2][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(cs[2][2] == "not scheduled")
                                cs[2][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(cs[2][3] == "not scheduled")
                                cs[2][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(cs[2][4] == "not scheduled")
                                cs[2][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(cs[2][5] == "not scheduled")
                                cs[2][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(cs[2][6] == "not scheduled")
                                cs[2][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 3)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(cs[3][1] == "not scheduled")
                                cs[3][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(cs[3][2] == "not scheduled")
                                cs[3][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(cs[3][3] == "not scheduled")
                                cs[3][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(cs[3][4] == "not scheduled")
                                cs[3][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(cs[3][5] == "not scheduled")
                                cs[3][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(cs[3][6] == "not scheduled")
                                cs[3][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else if(date == 4)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(cs[4][1] == "not scheduled")
                                cs[4][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(cs[4][2] == "not scheduled")
                                cs[4][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(cs[4][3] == "not scheduled")
                                cs[4][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(cs[4][4] == "not scheduled")
                                cs[4][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(cs[4][5] == "not scheduled")
                                cs[4][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(cs[4][6] == "not scheduled")
                                cs[4][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else if(date == 5)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(cs[5][1] == "not scheduled")
                                cs[5][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(cs[5][2] == "not scheduled")
                                cs[5][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(cs[5][3] == "not scheduled")
                                cs[5][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(cs[5][4] == "not scheduled")
                                cs[5][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(cs[5][5] == "not scheduled")
                                cs[5][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(cs[5][6] == "not scheduled")
                                cs[5][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else
                    {
                        System.out.println("this date is not assigned for examination, please enter right date");
                    }
                }
                System.out.println("Thank you, your exams are succesfully scheduled");
                System.out.println("\t\t\t\t\t\t|Computer|");
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print("|"+cs[i][j]+"\t|");
                    }
                    System.out.println();
                }
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
            }
            if(br==2)
            {
                System.out.println("Enter no. of Subjects ");
                int l=sc.nextInt();
                int b;
                String Sub;
                int date;
                String date1="1. 11-04-2021";
                String date2="2. 12-04-2021";
                String date3="3. 13-04-2021";
                String date4="4. 14-04-2021";
                String date5="5. 15-04-2021";
                String slot1="1. slot- 11:30-12:30";
                String slot2="2. slot- 12:30-13:30";
                String slot3="3. slot- 13:30-14:30";
                String slot4="4. slot- 14:30-15:30";
                String slot5="5. slot- 15:30-16:30";
                String slot6="6. slot- 16:30-17:30";
                mec[0][0]="date/time";
                mec[1][0]="11-04-2021";
                mec[2][0]="12-04-2021";
                mec[3][0]="13-04-2021";
                mec[4][0]="14-04-2021";
                mec[5][0]="15-04-2021";
                mec[0][1]="11:30-12:30";
                mec[0][2]="12:30-13:30";
                mec[0][3]="13:30-14:30";
                mec[0][4]="14:30-15:30";
                mec[0][5]="15:30-16:30";
                mec[0][6]="16:30-17:30";
                for(int i=1;i<6;i++)
                {
                    for(int j=1;j<7;j++)
                    {
                        mec[i][j] = "not scheduled";
                    }
                }
                for(int i=0;i<l;i++)
                {
                    System.out.println("Enter name of Subject ");
                    Sub=sc.next();
                    System.out.println("Following are the dates for exam. Please select one...");
                    System.out.println(date1);
                    System.out.println(date2);
                    System.out.println(date3);
                    System.out.println(date4);
                    System.out.println(date5);
                    date=sc.nextInt();
                    if(date == 1)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mec[1][1] == "not scheduled")
                                mec[1][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mec[1][2] == "not scheduled")
                                mec[1][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mec[1][3] == "not scheduled")
                                mec[1][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mec[1][4] == "not scheduled")
                                mec[1][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mec[1][5] == "not scheduled")
                                mec[1][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mec[1][6] == "not scheduled")
                                mec[1][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 2)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mec[2][1] == "not scheduled")
                                mec[2][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mec[2][2] == "not scheduled")
                                mec[2][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mec[2][3] == "not scheduled")
                                mec[2][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mec[2][4] == "not scheduled")
                                mec[2][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mec[2][5] == "not scheduled")
                                mec[2][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mec[2][6] == "not scheduled")
                                mec[2][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 3)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mec[3][1] == "not scheduled")
                                mec[3][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mec[3][2] == "not scheduled")
                                mec[3][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mec[3][3] == "not scheduled")
                                mec[3][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mec[3][4] == "not scheduled")
                                mec[3][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mec[3][5] == "not scheduled")
                                mec[3][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mec[3][6] == "not scheduled")
                                mec[3][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else if(date == 4)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mec[4][1] == "not scheduled")
                                mec[4][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mec[4][2] == "not scheduled")
                                mec[4][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mec[4][3] == "not scheduled")
                                mec[4][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mec[4][4] == "not scheduled")
                                mec[4][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mec[4][5] == "not scheduled")
                                mec[4][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mec[4][6] == "not scheduled")
                                mec[4][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }else if(date == 5)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mec[5][1] == "not scheduled")
                                mec[5][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mec[5][2] == "not scheduled")
                                mec[5][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mec[5][3] == "not scheduled")
                                mec[5][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mec[5][4] == "not scheduled")
                                mec[5][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mec[5][5] == "not scheduled")
                                mec[5][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mec[5][6] == "not scheduled")
                                mec[5][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else
                    {
                        System.out.println("this date is not assigned for examination, please enter right date");
                    }
                }
                System.out.println("Thank you, your exams are succesfully scheduled");
                System.out.println("\t\t\t\t\t\t|Mechanical|");
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print("|"+mec[i][j]+"\t|");
                    }
                    System.out.println();
                }
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
            }
            if(br==3)
            {
                System.out.println("Enter no. of Subjects ");
                int l=sc.nextInt();
                int b;
                String Sub;
                int date;
                String date1="1. 11-04-2021";
                String date2="2. 12-04-2021";
                String date3="3. 13-04-2021";
                String date4="4. 14-04-2021";
                String date5="5. 15-04-2021";
                String slot1="1. slot- 11:30-12:30";
                String slot2="2. slot- 12:30-13:30";
                String slot3="3. slot- 13:30-14:30";
                String slot4="4. slot- 14:30-15:30";
                String slot5="5. slot- 15:30-16:30";
                String slot6="6. slot- 16:30-17:30";
                mx[0][0]="date/time";
                mx[1][0]="11-04-2021";
                mx[2][0]="12-04-2021";
                mx[3][0]="13-04-2021";
                mx[4][0]="14-04-2021";
                mx[5][0]="15-04-2021";
                mx[0][1]="11:30-12:30";
                mx[0][2]="12:30-13:30";
                mx[0][3]="13:30-14:30";
                mx[0][4]="14:30-15:30";
                mx[0][5]="15:30-16:30";
                mx[0][6]="16:30-17:30";
                for(int i=1;i<6;i++)
                {
                    for(int j=1;j<7;j++)
                    {
                        mx[i][j] = "not scheduled";
                    }
                }
                for(int i=0;i<l;i++)
                {
                    System.out.println("Enter name of Subject ");
                    Sub=sc.next();
                    System.out.println("Following are the dates for exam. Please select one...");
                    System.out.println(date1);
                    System.out.println(date2);
                    System.out.println(date3);
                    System.out.println(date4);
                    System.out.println(date5);
                    date=sc.nextInt();
                    if(date == 1)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mx[1][1] == "not scheduled")
                                mx[1][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mx[1][2] == "not scheduled")
                                mx[1][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mx[1][3] == "not scheduled")
                                mx[1][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mx[1][4] == "not scheduled")
                                mx[1][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mx[1][5] == "not scheduled")
                                mx[1][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mx[1][6] == "not scheduled")
                                mx[1][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 2)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mx[2][1] == "not scheduled")
                                mx[2][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mx[2][2] == "not scheduled")
                                mx[2][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mx[2][3] == "not scheduled")
                                mx[2][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mx[2][4] == "not scheduled")
                                mx[2][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mx[2][5] == "not scheduled")
                                mx[2][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mx[2][6] == "not scheduled")
                                mx[2][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 3)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mx[3][1] == "not scheduled")
                                mx[3][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mx[3][2] == "not scheduled")
                                mx[3][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mx[3][3] == "not scheduled")
                                mx[3][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mx[3][4] == "not scheduled")
                                mx[3][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mx[3][5] == "not scheduled")
                                mx[3][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mx[3][6] == "not scheduled")
                                mx[3][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 4)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mx[4][1] == "not scheduled")
                                mx[4][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mx[4][2] == "not scheduled")
                                mx[4][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mx[4][3] == "not scheduled")
                                mx[4][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mx[4][4] == "not scheduled")
                                mx[4][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mx[4][5] == "not scheduled")
                                mx[4][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mx[4][6] == "not scheduled")
                                mx[4][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 5)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(mx[5][1] == "not scheduled")
                                mx[5][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(mx[5][2] == "not scheduled")
                                mx[5][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(mx[5][3] == "not scheduled")
                                mx[5][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(mx[5][4] == "not scheduled")
                                mx[5][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(mx[5][5] == "not scheduled")
                                mx[5][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(mx[5][6] == "not scheduled")
                                mx[5][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else
                    {
                        System.out.println("this date is not assigned for examination, please enter right date");
                    }
                }
                System.out.println("Thank you, your exams are succesfully scheduled");
                System.out.println("\t\t\t\t\t\t|Mechatronics|");
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print("|"+mx[i][j]+"\t|");
                    }
                    System.out.println();
                }
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
            }
            if(br==4)
            {
                System.out.println("Enter no. of Subjects ");
                int l=sc.nextInt();
                int b;
                String Sub;
                int date;
                String date1="1. 11-04-2021";
                String date2="2. 12-04-2021";
                String date3="3. 13-04-2021";
                String date4="4. 14-04-2021";
                String date5="5. 15-04-2021";
                String slot1="1. slot- 11:30-12:30";
                String slot2="2. slot- 12:30-13:30";
                String slot3="3. slot- 13:30-14:30";
                String slot4="4. slot- 14:30-15:30";
                String slot5="5. slot- 15:30-16:30";
                String slot6="6. slot- 16:30-17:30";
                bt[0][0]="date/time";
                bt[1][0]="11-04-2021";
                bt[2][0]="12-04-2021";
                bt[3][0]="13-04-2021";
                bt[4][0]="14-04-2021";
                bt[5][0]="15-04-2021";
                bt[0][1]="11:30-12:30";
                bt[0][2]="12:30-13:30";
                bt[0][3]="13:30-14:30";
                bt[0][4]="14:30-15:30";
                bt[0][5]="15:30-16:30";
                bt[0][6]="16:30-17:30";
                for(int i=1;i<6;i++)
                {
                    for(int j=1;j<7;j++)
                    {
                        bt[i][j] = "not scheduled";
                    }
                }
                for(int i=0;i<l;i++)
                {
                    System.out.println("Enter name of Subject ");
                    Sub=sc.next();
                    System.out.println("Following are the dates for exam. Please select one...");
                    System.out.println(date1);
                    System.out.println(date2);
                    System.out.println(date3);
                    System.out.println(date4);
                    System.out.println(date5);
                    date=sc.nextInt();
                    if(date == 1)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bt[1][1] == "not scheduled")
                                bt[1][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bt[1][2] == "not scheduled")
                                bt[1][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bt[1][3] == "not scheduled")
                                bt[1][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bt[1][4] == "not scheduled")
                                bt[1][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bt[1][5] == "not scheduled")
                                bt[1][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bt[1][6] == "not scheduled")
                                bt[1][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 2)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bt[2][1] == "not scheduled")
                                bt[2][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bt[2][2] == "not scheduled")
                                bt[2][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bt[2][3] == "not scheduled")
                                bt[2][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bt[2][4] == "not scheduled")
                                bt[2][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bt[2][5] == "not scheduled")
                                bt[2][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bt[2][6] == "not scheduled")
                                bt[2][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 3)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bt[3][1] == "not scheduled")
                                bt[3][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bt[3][2] == "not scheduled")
                                bt[3][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bt[3][3] == "not scheduled")
                                bt[3][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bt[3][4] == "not scheduled")
                                bt[3][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bt[3][5] == "not scheduled")
                                bt[3][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bt[3][6] == "not scheduled")
                                bt[3][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 4)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bt[4][1] == "not scheduled")
                                bt[4][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bt[4][2] == "not scheduled")
                                bt[4][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bt[4][3] == "not scheduled")
                                bt[4][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bt[4][4] == "not scheduled")
                                bt[4][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bt[4][5] == "not scheduled")
                                bt[4][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bt[4][6] == "not scheduled")
                                bt[4][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 5)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bt[5][1] == "not scheduled")
                                bt[5][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bt[5][2] == "not scheduled")
                                bt[5][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bt[5][3] == "not scheduled")
                                bt[5][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bt[5][4] == "not scheduled")
                                bt[5][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bt[5][5] == "not scheduled")
                                bt[5][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bt[5][6] == "not scheduled")
                                bt[5][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }

                    else
                    {
                        System.out.println("this date is not assigned for examination, please enter right date");
                    }
                }
                System.out.println("Thank you, your exams are succesfully scheduled");
                System.out.println("\t\t\t\t\t\t|BioTech|");
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print("|"+bt[i][j]+"\t|");
                    }
                    System.out.println();
                }
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
            }
            if(br==5)
            {
                System.out.println("Enter no. of Subjects ");
                int l=sc.nextInt();
                int b;
                String Sub;
                int date;
                String date1="1. 11-04-2021";
                String date2="2. 12-04-2021";
                String date3="3. 13-04-2021";
                String date4="4. 14-04-2021";
                String date5="5. 15-04-2021";
                String slot1="1. slot- 11:30-12:30";
                String slot2="2. slot- 12:30-13:30";
                String slot3="3. slot- 13:30-14:30";
                String slot4="4. slot- 14:30-15:30";
                String slot5="5. slot- 15:30-16:30";
                String slot6="6. slot- 16:30-17:30";
                bm[0][0]="date/time";
                bm[1][0]="11-04-2021";
                bm[2][0]="12-04-2021";
                bm[3][0]="13-04-2021";
                bm[4][0]="14-04-2021";
                bm[5][0]="15-04-2021";
                bm[0][1]="11:30-12:30";
                bm[0][2]="12:30-13:30";
                bm[0][3]="13:30-14:30";
                bm[0][4]="14:30-15:30";
                bm[0][5]="15:30-16:30";
                bm[0][6]="16:30-17:30";
                for(int i=1;i<6;i++)
                {
                    for(int j=1;j<7;j++)
                    {
                        bm[i][j] = "not scheduled";
                    }
                }
                for(int i=0;i<l;i++)
                {
                    System.out.println("Enter name of Subject ");
                    Sub=sc.next();
                    System.out.println("Following are the dates for exam. Please select one...");
                    System.out.println(date1);
                    System.out.println(date2);
                    System.out.println(date3);
                    System.out.println(date4);
                    System.out.println(date5);
                    date=sc.nextInt();
                    if(date == 1)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bm[1][1] == "not scheduled")
                                bm[1][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bm[1][2] == "not scheduled")
                                bm[1][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bm[1][3] == "not scheduled")
                                bm[1][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bm[1][4] == "not scheduled")
                                bm[1][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bm[1][5] == "not scheduled")
                                bm[1][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bm[1][6] == "not scheduled")
                                bm[1][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 2)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bm[2][1] == "not scheduled")
                                bm[2][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bm[2][2] == "not scheduled")
                                bm[2][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bm[2][3] == "not scheduled")
                                bm[2][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bm[2][4] == "not scheduled")
                                bm[2][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bm[2][5] == "not scheduled")
                                bm[2][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bm[2][6] == "not scheduled")
                                bm[2][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 3)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bm[3][1] == "not scheduled")
                                bm[3][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bm[3][2] == "not scheduled")
                                bm[3][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bm[3][3] == "not scheduled")
                                bm[3][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bm[3][4] == "not scheduled")
                                bm[3][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bm[3][5] == "not scheduled")
                                bm[3][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bm[3][6] == "not scheduled")
                                bm[3][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 4)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bm[4][1] == "not scheduled")
                                bm[4][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bm[4][2] == "not scheduled")
                                bm[4][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bm[4][3] == "not scheduled")
                                bm[4][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bm[4][4] == "not scheduled")
                                bm[4][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bm[4][5] == "not scheduled")
                                bm[4][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bm[4][6] == "not scheduled")
                                bm[4][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else if(date == 5)
                    {
                        System.out.println("Following are the time slots for exam. Please select one...");
                        System.out.println(slot1);
                        System.out.println(slot2);
                        System.out.println(slot3);
                        System.out.println(slot4);
                        System.out.println(slot5);
                        System.out.println(slot6);
                        b=sc.nextInt();
                        if(b==1)
                        {
                            if(bm[5][1] == "not scheduled")
                                bm[5][1]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==2)
                        {
                            if(bm[5][2] == "not scheduled")
                                bm[5][2]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==3)
                        {
                            if(bm[5][3] == "not scheduled")
                                bm[5][3]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==4)
                        {
                            if(bm[5][4] == "not scheduled")
                                bm[5][4]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==5)
                        {
                            if(bm[5][5] == "not scheduled")
                                bm[5][5]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                        if(b==6)
                        {
                            if(bm[5][6] == "not scheduled")
                                bm[5][6]=Sub+"\t";
                            else{
                                System.out.println("Slot not available");
                                i--;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("this date is not assigned for examination, please enter right date");
                    }
                }
                System.out.println("Thank you, your exams are succesfully scheduled");
                System.out.println("\t\t\t\t\t\t|BioMedical|");
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    for(int j=0;j<7;j++)
                    {
                        System.out.print("|"+bm[i][j]+"\t|");
                    }
                    System.out.println();
                }
                for(int i=0;i<113;i++)
                {
                    System.out.print("-");
                }
            }
            System.out.println();
            System.out.println("To continue, press 1. Else, to quit press 2");
            x=sc.nextInt();
            if(x==1)
                continue;
            else if(x==2)
                q=0;
        }
    }
}
