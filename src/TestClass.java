

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestClass {

    @Test
    public  void TestAntalRader(){
        //Arrange
        String  AntalrRader ="1";
        String AntalTecken = "3";
        String Stop ="0";

        CountClass AntalRader = new CountClass(AntalrRader, AntalTecken,Stop);

        //Act
        String actual =  AntalRader.getAntalRader();
        //Assert
        String expected ="1";

        assertEquals(expected, actual);
    }


    @Test
    public  void TestAntalTecken(){
        //Arrange
        String AntalTecken = "3";
        String  AntalrRader ="3";

        String Stop ="0";

        CountClass AntalTeckenen = new CountClass(AntalTecken,AntalrRader, Stop);

        //Act
        String actual =  AntalTeckenen.getAntalTecken();
        //Assert
        String expected ="3";

        assertEquals(expected, actual);
    }

    @Test
    public  void TestStopAll(){
        //Arrange

        String AntalTecken = "5";

        String  AntalrRader ="2";

        String Stop ="0";

        CountClass AntalStop = new CountClass(Stop,AntalTecken,AntalrRader);

        //Act
        String actual =  AntalStop.getStop();
        //Assert
        String expected ="2";

        assertEquals(expected, actual);
    }
}

