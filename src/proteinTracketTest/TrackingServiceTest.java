package proteinTracketTest;

import org.junit.Test;

import com.simpleprogrammer.proteintracker.TrackingService;
import static org.junit.Assert.*;
public class TrackingServiceTest {


@Test
public void TotalZero()
{
	TrackingService service = new TrackingService();
	assertEquals ("Trackign service total zero", 0, service.getTotal());
	
	
	
}

}
