// Nama : Afif Nur Fauzi
// NIM  : M0521007

public class PPBO_02_Latihan4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        
        Person dummy1 = new Person();
        Person dummy2 = new Person();
        Person dummy3 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: "+ Person.count );
        
        Person dummy4 = new Person();
        System.out.println( "Jumlah objek Person yang telah terbuat: "+ Person.count);
        
    }
}


class Person
{
   
    //
        //Tulis kode kalian di sini 
        public static int count; // default constructor 0
        Person(){
            count++;
        } 
    //
}


// Lengkapi class Person supaya dapat menghitung jumlah objek yang telah dibuat dari class Person,
// Gunakan variable static dan constructor, serta tampilkan nilai tersebut pada baris print yang telah
// disediakan 

/* Output yang diharapkan:
    Jumlah objek Person yang telah terbuat: 3 
    Jumlah objek Person yang telah terbuat: 4
 */