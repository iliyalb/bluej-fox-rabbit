public class Program 
{     
    public static void main()
    { 
        instantiate();
        // Part ب سوال 1: این متد پابلیک استاتیک است زیرا باید بتوان از همه جای برنامه به آن دسترسی پیدا کرد
        // Part ب سوال 2: فیلد ها و متد هایی که صرفا استاتیک هستند. زیرا فراخوانی اعضای غیر استاتیک در متد استاتیک ممکن نیست
        // Part ب سوال 3: می تواند تعداد تقریبا بی نهایت آرگومان در قالب آرایه دریافت کند
    } 
    
    private static void instantiate()
    {
        City C = new City("LA" , "Los Angeles");
        Building B1 = new Building("B1","123");
        Building B2 = new Building("B2","456");
        Building B3 = new Building("B3","789");
    }
} 