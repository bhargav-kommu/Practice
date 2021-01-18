
import java.util.HashMap;
import java.util.Map;

public class EqualsHashCode {
	
	private String color;
	
	public EqualsHashCode(String c){
		this.color = c;
	}
	
	
	
	public static void main(String[] args) {
		
		EqualsHashCode e1 = new EqualsHashCode("Red");
		EqualsHashCode e2 = new EqualsHashCode("Green");
		
		
		HashMap<EqualsHashCode,Integer> map  = new HashMap<EqualsHashCode,Integer>();
		map.put(e1, 10);
		map.put(e2, 20);
		
		System.out.println(map.get(new EqualsHashCode("Red")));
		System.out.println(map.get(new EqualsHashCode("Green")));
		
		
	}



	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		System.out.println("result"+result);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		System.out.println("obj"+obj);
		System.out.println("this"+this);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashCode other = (EqualsHashCode) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	

}
