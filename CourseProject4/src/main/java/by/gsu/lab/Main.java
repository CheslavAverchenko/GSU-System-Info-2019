package by.gsu.lab;
import java.io.*;



public class Main {


    public static void BIOSgetInfo() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_bios";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

    public static void VideogetInfo()throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_VideoController";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

//    public static void MouseGetInfo() throws Exception {
//        ProcessBuilder builder1 = new ProcessBuilder(
//                "cmd.exe", "/c", "wmic path Win32_PointingDevice");
//        builder1.redirectErrorStream(true);
//        Process p = builder1.start();
//        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(), "CP866"));
//        String line;
//        while (true) {
//            line = r.readLine();
//            if (line == null) {
//                break;
//            }
//            System.out.println(line);
//        }
//    }
    public static void UptimeGetInfo() throws Exception{
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "systeminfo | find \"Время загрузки системы:\"");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(), "CP866"));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
        //eventvwr ASOI eventquery/l security /fi «id ge 4647»
        // "C:\Users\Чеслав\IdeaProjects\CourseProject4\EventLogs.txt"
//        builder = new ProcessBuilder(
//                "cmd.exe", "/c", " more C:\\Users\\Чеслав\\IdeaProjects\\CourseProject4\\EventLogs.txt");
//        builder.redirectErrorStream(true);
//        p = builder.start();
//        r = new BufferedReader(new InputStreamReader(p.getInputStream(), "UTF-8"));
//        while (true) {
//            line = r.readLine();
//            if (line == null) { break; }
//            System.out.println(line);
//        }
    }
    public static void HDD_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_DiskDrive";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }
    public static void BaseBoard_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_BaseBoard";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

//    public static void Mouse_Get_Info() throws Exception{
//        //String command = "powershell.exe  your command";
//        //Getting the version
//        String command = "powershell.exe  Get-WmiObject win32_IDEController";
//        // Executing the command
//        Process powerShellProcess = Runtime.getRuntime().exec(command);
//        // Getting the results
//        powerShellProcess.getOutputStream().close();
//        String line;
//        System.out.println("Standard Output:");
//        BufferedReader stdout = new BufferedReader(new InputStreamReader(
//                powerShellProcess.getInputStream(), "CP866"));
//        while ((line = stdout.readLine()) != null) {
//            System.out.println(line);
//        }
//        stdout.close();
//        System.out.println("Standard Error:");
//        BufferedReader stderr = new BufferedReader(new InputStreamReader(
//                powerShellProcess.getErrorStream()));
//        while ((line = stderr.readLine()) != null) {
//            System.out.println(line);
//        }
//        stderr.close();
//        System.out.println("Done");
//
//    }
    public static void Monitor_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_DesktopMonitor";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream(),"CP866"));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }
    public static void HDD_Sections_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_LogicalDisk";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

//    public static void Log_Get_Info() throws Exception{
//        //String command = "powershell.exe  your command";
//        //Getting the version
//        String command = "powershell.exe  Get-WmiObject win32_NTEventlogFile";
//        // Executing the command
//        Process powerShellProcess = Runtime.getRuntime().exec(command);
//        // Getting the results
//        powerShellProcess.getOutputStream().close();
//        String line;
//        System.out.println("Standard Output:");
//        BufferedReader stdout = new BufferedReader(new InputStreamReader(
//                powerShellProcess.getInputStream(),"CP866"));
//        while ((line = stdout.readLine()) != null) {
//            System.out.println(line);
//        }
//        stdout.close();
//        System.out.println("Standard Error:");
//        BufferedReader stderr = new BufferedReader(new InputStreamReader(
//                powerShellProcess.getErrorStream()));
//        while ((line = stderr.readLine()) != null) {
//            System.out.println(line);
//        }
//        stderr.close();
//        System.out.println("Done");
//    }
    public static void Keyboard_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_Keyboard";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream(),"CP866"));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

    public static void Mouse_Get_Info() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_PointingDevice";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream(),"CP866"));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

    public static void CPUGetInfo() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WmiObject win32_Processor";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream()));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
        System.out.println("Standard Error:");
        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        while ((line = stderr.readLine()) != null) {
            System.out.println(line);
        }
        stderr.close();
        System.out.println("Done");
    }

    public static void UserTiimeGetInfo() throws Exception{
        //String command = "powershell.exe  your command";
        //Getting the version
        String command = "powershell.exe  Get-WMIObject win32_operatingsystem | select csname, @{LABEL=’LastBootUpTime’; EXPRESSION={$_.ConverttoDateTime($_.lastbootuptime)}}";
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        // Getting the results
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Standard Output:");
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
                powerShellProcess.getInputStream(),"CP866"));
        while ((line = stdout.readLine()) != null) {
            System.out.println(line);
        }
        stdout.close();
//        System.out.println("Standard Error:");
//        BufferedReader stderr = new BufferedReader(new InputStreamReader(
//                powerShellProcess.getErrorStream()));
//        while ((line = stderr.readLine()) != null) {
//            System.out.println(line);
//        }
//        stderr.close();
        System.out.println("Done");

        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "systeminfo | find \"Зарегистрированный владелец:\"");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(), "CP866"));
        String line2;
        while (true) {
            line2 = r.readLine();
            if (line2 == null) { break; }
            System.out.println(line2);
        }


         builder = new ProcessBuilder(
                "cmd.exe", "/c", "systeminfo | find \"Время загрузки системы:\"");
        builder.redirectErrorStream(true);
         p = builder.start();
         r = new BufferedReader(new InputStreamReader(p.getInputStream(), "CP866"));
        while (true) {
            line2 = r.readLine();
            if (line2 == null) { break; }
            System.out.println(line2);
        }
    }


    public static void main(String[] args) throws Exception {

            //MouseGetInfo();
          Mouse_Get_Info();
//        BIOSgetInfo();
  //      VideogetInfo();
//        System.out.print("\n");
       // UptimeGetInfo();
       // UserTiimeGetInfo();
  //        CPUGetInfo();
        //Monitor_Get_Info();
        //HDD_Sections_Get_Info();
        //HDD_Get_Info();
        //Keyboard_Get_Info();
        //(Don't touch this, method is incomplete)Log_Get_Info();
        //BaseBoard_Get_Info();
        //Mouse_Get_Info();



    }

}


