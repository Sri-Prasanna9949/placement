import java.util.*;
interface MediaPlayer
{
    void play();
    void pause();
    void stop();

}
class AudioPlayer implements MediaPlayer
{
    public void play()
    {
        System.out.println("Audio played ");
    }
    public void pause()
    {
        System.out.println("Audio paused ");
    }
    public void stop()
    {
        System.out.println("Audio stopped ");
    }
}
class VideoPlayer implements MediaPlayer
{
    public void play()
    {
        System.out.println("video played ");
    }
    public void pause()
    {
        System.out.println("video paused ");
    }
    public void stop()
    {
        System.out.println("video stopped ");
    }
}
class StreamingPlayer implements MediaPlayer
{
    public void play()
    {
        System.out.println("streaming playing ");
    }
    public void pause()
    {
        System.out.println("streaming paused ");
    }
    public void stop()
    {
        System.out.println("streaming stopped ");
    }
}
public class Main 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the player : ");
        
        String s1=in.nextLine();
        
        MediaPlayer obj=null;
        
        if(s1.equalsIgnoreCase("Audio"))
        {
           obj= new AudioPlayer();
        }
        else if(s1.equalsIgnoreCase("Video"))
        {
            obj= new VideoPlayer();
        }
        else if(s1.equalsIgnoreCase("Streaming"))
        {
            obj= new StreamingPlayer();
        }
        else{
            System.out.println("invalid command");
        }
        
        
        System.out.println("enter the command : ");
        
        String s2=in.nextLine();
        
        if(s2.equalsIgnoreCase("play"))
        {
            obj.play();
        }
        else if (s2.equalsIgnoreCase("pause"))
        {
            obj.pause();
        }
        else if (s2.equalsIgnoreCase("stop"))
        {
            obj.stop();
        }
        else{
            System.out.println("invalid command");
        }
	}
		
}