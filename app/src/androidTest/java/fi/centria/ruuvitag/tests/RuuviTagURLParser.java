package fi.centria.ruuvitag.tests;

import org.junit.Test;

import fi.ruuvi.android.model.RuuviTag;

import static junit.framework.Assert.assertEquals;

/**
 * Created by admin on 23/07/2017.
 */

public class RuuviTagURLParser
{

        @Test
        public void parserTests() throws Exception
        {
            //

            RuuviTag tag = new RuuviTag("0","https://ruu.vi/#BAASADyM5",null,"-87",false);
            assertEquals(tag.getTemperature(),18);

        }

}

