import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;



public class TimeAgoTest {

	@Test
	public void testAgora() {
		TimeAgo timeAgo = new TimeAgo(Calendar.getInstance());
		Assert.assertEquals("agora", timeAgo.toString());
	}
	
	@Test
	public void testMinuto(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.MINUTE, -1);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("1 minuto atr‡s", timeAgo.toString());
	}
	
	@Test
	public void test2Minutos(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.MINUTE, -2);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("2 minutos atr‡s", timeAgo.toString());
	}
	
	@Test
	public void test59Minutos(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.MINUTE, -59);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("59 minutos atr‡s", timeAgo.toString());
	}
	
	@Test
	public void testHora(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.HOUR, -1);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("1 hora atr‡s", timeAgo.toString());
	}
	
	@Test
	public void test2Horas(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.HOUR, -2);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("2 horas atr‡s", timeAgo.toString());
	}
	
	@Test
	public void test23Horas(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.HOUR, -23);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("23 horas atr‡s", timeAgo.toString());
	}
	
	@Test
	public void testUltimoSegundoDia(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.HOUR, -24);
		time.add(Calendar.SECOND, 1);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("23 horas atr‡s", timeAgo.toString());
	}
	
	@Test
	public void testDia(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.HOUR, -24);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("1 dia atr‡s", timeAgo.toString());
	}
	
	@Test
	public void testDoisDiasAtras(){
		Calendar time = Calendar.getInstance();
		time.add(Calendar.DAY_OF_YEAR, -2);
		TimeAgo timeAgo = new TimeAgo(time);
		Assert.assertEquals("2 dias atr‡s", timeAgo.toString());
	}
	
}