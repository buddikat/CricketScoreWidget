/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket.score.widget.setting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brannulu
 */
public class SettingsReader {
    
    public static void main(String[] args) {
        SettingsReader st = new SettingsReader();
        st.readSettings();
    }

    public void readSettings() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src\\resource\\settings.properties");

            prop.load(input);
            System.out.println(prop.getProperty("country"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    Logger.getLogger(SettingsReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
