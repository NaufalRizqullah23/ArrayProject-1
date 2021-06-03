package arrayTest;

public class ArrayExample {
	public static void main(String[]args) {
		String[] DataProdi = {"Administrasi","Agroteknologi","Teknik Elektro","Bahasa Arab"
	                        ,"Bahasa Inggris","Teknik Informatika","Fisika","Kimia","Biologi"
	                        ,"Managemen"};
	for(int x = 0;x<DataProdi.length;x++) {
		if(x==3) continue;
			System.out.println(DataProdi[x]);
	}
	}
}
