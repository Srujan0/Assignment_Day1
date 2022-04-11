//Single Responsiblility each class responsible for single operation
public class Calculation{
    public double sum(int a , int b){
        /*
        calculate
        return sum
         */
    }
    public double multiply(){
        /*
        return multiplication
         */
    }
}

//Open cloase principal: class should be open for extention close for modification
interface Calculation{
    public double get_sum(int a , int b);
    public double print_sum();
}
public class CalPrograme extends Calculation{
    public double get_sum(){
        /*logic*/
    }
    public double print_sum(){
        /*logic*/
    }
}

//Liskov Substitution Principal: //
// derived classes must be completely subsitutable for their base classes
interface socialMedia{
    void send_msg();
    void set_Profile();
}

interface socialMedia_imageShare{
     void send_photos();
     void send_videos();
}

interface socialMedia_videoCall{
     void video_Call();
}

class whatsapp implements socialMedia,socialMedia_imageShare{
    public void send_msg(){/*logic*/};
    public void set_Profile(){/*logic*/};
    public void send_photos(){/*logic*/};
    public void send_videos(){/*logic*/};
}

class facebook implements socialMedia,socialMedia_videoCall{
    public void send_msg(){/*logic*/};
    public void set_Profile(){/*logic*/};
    public void video_Call(){/*logic*/};
}


//Interface Segregation Principal: donot force any clint to impliment a interface which is irrelevant to them
interface socialMedia{
    void send_msg();
    void set_Profile();
    void send_photos();
    void send_videos();
    void video_Call();
}

class facebook implements socialMedia,socialMedia_videoCall{
    public void send_msg(){/*logic*/};
    public void set_Profile(){/*logic*/};
    public void video_Call(){/*logic*/};
}
//This is bad practice of programming To soulve this we use Interface Segregation Principal


//Dependency Inversion Principle
//we must use abstraction instead of concrete implementation
public interface Calculation{
    public double get_sum(int a , int b);
    public double print_sum();
}
public class CalPrograme extends Calculation{
    public double get_sum(){
        /*logic*/
    }
    public double print_sum(){
        /*logic*/
    }
}