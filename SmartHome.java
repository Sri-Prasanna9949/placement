import java.util.*;
class SmartHome
{
    final static class Device
    {
        static String dname;
        static int devid;
        final static int MAX_DEVICES=50;
         final static void getDeviceInfo(int x, String y) {
            devid = x;
            dname = y;
            System.out.println("Device name : "+dname);
            System.out.println("Device ID : "+devid);
        }
    }
    final static class Configuration
    {
        final static int MAX_POWER_LIMIT = 5000;
        static void display()
        {
            System.out.println("MAX POWER LIMIT : "+MAX_POWER_LIMIT);
        }
    }
    abstract static class DeviceType
    {
        abstract  void getDeviceCategory();
    }
    static class FanDevice extends DeviceType
    {
        public void getDeviceCategory()
        {
            System.out.println("FAN DEVICE");
        }
    }
    static class LightDevice extends DeviceType
    {
        public void getDeviceCategory()
        {
            System.out.println("LIGHT DEVICE");
        }
    }

    public static void main(String arge[])
    {
        Device.getDeviceInfo(20,"philips");
        Configuration.display();
        DeviceType light = new LightDevice();
        DeviceType fan = new FanDevice();
        light.getDeviceCategory();
        fan.getDeviceCategory();
    }
}