public class Format {
    String line="";
    String ruble(float numb){
        int i = (int)Math.floor(numb);
        if(i<21){
            compare(i);
        }else{
            compare(i%10);
        }
        return line;
    }
    void compare(int i){
        if(i==0){
            line="рублей";
        }else if(i==1){
            line="рубль";
        }else if(i<5){
            line="рубля";
        }else{
            line="рублей";
        }
    }
    String price(float numb){
        String template = "%.2f";
        return String.format(template, numb);
    }
}
