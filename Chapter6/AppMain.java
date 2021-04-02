package Chapter6;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/3 0:28
 * @copyright 老九学堂
 * @remark TODO
 */
public class AppMain {
    public static void main(String[] args) throws MalformedURLException {
        AudioClip sound = Applet.newAudioClip(new File("sounds/背景音乐.wav").toURL());
        sound.play();
        sound.stop();
    }
}
