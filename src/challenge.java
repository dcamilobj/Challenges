import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calc(8));
		
	}

	public void dontKnow()
	{
		String string; 
		BufferedReader br;
		try{

			br = new BufferedReader(new InputStreamReader(System.in));
			string= br.readLine();
			int i; 
			for(i=0; i<string.length(); i++)
			{
			}
			System.out.println("This is the result:" + string);
			
		}catch(IOException e)
		{
			System.out.println("I need to understand more this");
		}
	}
	
	public static void thePowers()
	{
		//x = ((17 to_the_power_of 39) to_the_power_of 11)
		//x less first digit
		String num = "2876460471756938091810036585606246900019342494750375833834109668699"
				+ "68575446743622723472404262710296429884182051603723352847597845978541475"
				+ "93648871858097274405592779889038847476635050174799866232012301434410796"
				+ "89854280924956390463712324688388834396706355484824634202027888911648163"
				+ "64632521828315194205599067991807910869859573411971277833305657725642426"
				+ "51403912456455317933419062751330828700987778645214725045780084668671936"
				+ "67375212847828614080695158122892438870176893141990559530641909316271756"
				+ "0756925359266275186144493274175697";

		int i;
		//first digit of num
		String res = "7";
		System.out.println(num.length() / 33);
		for(i=0; i < num.length(); i++)
		{
			if(((i+1) % 33) == 0)
			{
				res = res.concat(num.substring(i, i+1));
			}
		}
		System.out.println(res.length());
	}
	
	public static void lowerCase()
	{
		String s = "mQmPtphqGrboHhmgaqVhCdwTwignlQvjIopDqVpgaNrwkAzVcnkHyNiPdSmgJmgrPiMjpnjdbu"
				+ "PucHnouwfKuPcybromnmbvfxJqRnnOvWsceZeYzRyqnkaaFsffjenxoIhqHnIzorlOdwZoxYmAu"
				+ "NwNnRppguwidvbtOqdbUngpZdbGqwYjfpLzPjRtwVwEqBbYmCqbKwuziCoEwPsIkJgruTbhdyWp"
				+ "vPztAodufjZxLaZcUeFaklSmeRfolohVbXoDfIqMqgIrQhzedqZlFwaBndQkQexBdLsCfXebrEf"
				+ "iOnSgYquyaqohxoDmLdDhwoOpgtkuRzeYziuvnuvnUuOtqasZueYpKfAkmKcJcWeocQvJguVsZf"
				+ "VovgrztAiryZivHqyMjoLyJdklKifmoWeOjVnogiiaBzDfrsWlOeAzPxltamqQiujZrpZrUcIly"
				+ "ktdJbhmNpDbltOlLnAqVhcxgObghpdcScgIiayqygUgwatiEzgzTsZgApUbbPynLfbzehzWsxcP"
				+ "bdcdfMucsCzjkWvjhMkiWuHfquqrcKwedqghiyHyMkSayRegeJcGw";
		
		int i;
		int count = 0;
		for(i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
	
	public static void primeFactors(int n)
	{
		int half = n/2; 
		int i,j,count,x,y; 
		List<Integer> primeNumbers = new ArrayList<Integer>();
		List<Integer> primeFactors = new ArrayList<Integer>();
		primeNumbers.add(1);
		primeNumbers.add(2);
		for(i = 3; i <= half; i++)
		{
			count = 0;
			for(j=0; j < primeNumbers.size(); j++)
			{
				if((i % (primeNumbers.get(j)))  == 0)
				{
					count+=1;
				}
			}
			if(count == 1)
			{
				primeNumbers.add(i);
			}
		}
		
		for (x=0; x < primeNumbers.size(); x++) {
			int prime = primeNumbers.get(x);
			if((n % prime) == 0)
				primeFactors.add(prime);
		}
		
		for(y=0; y <primeFactors.size(); y ++)
			System.out.println(primeFactors.get(y));
	}
	
	public static void valuation(String s)
	{
		//93752xxx746x27x1754xx90x93xxxxx238x44x75xx08750912738x8461x8759383xx328x4x4935903x6x5550360535004x0xx945958961296x267x8842xxx5x6xx61x4x48482x80xxx83316843x7x4x83x9521731xxx25x51xx457x6x5x9698222x771237745034x5133592x27xx8x87xx35221x36x0x50x23x7x63x998418xx
		int i; 
		int sum = 0; 
		StringBuilder sb = new StringBuilder(s);
		for(i=0; i < s.length(); i++)
		{
			char a =  s.charAt(i);
			if(Character.isDigit(a))
				sum+= Character.getNumericValue(a);
			else
			{
				sb.deleteCharAt(i);
				s = sb.toString();
				i-=3;
			}
		}
		System.out.println("suma es: " + sum);
	}
	
	public static void delegates(int limit)
	{
		//limit of the challenge : 2118
		List<Integer> perfectSquares = new ArrayList<>();
		int count = 1;
		int product = count*count;
		int total=0;
		while(product <= limit )
		{
			perfectSquares.add(product);
			count++;
			product = count*count;
		}
		
		for (int i = 1; i <= limit ; i++) {
			total+=i;
		}
		
		for (int i = 0; i < perfectSquares.size(); i++) {
			total+= perfectSquares.get(i);
		}
		
		System.out.println("Total es:" + total);
	}
	
	public static long calc(int depth) {
		if (depth == 0) return 1;
		long cc = calc(depth - 1);
		return cc + (depth % 7) + ((((cc ^ depth) % 4) == 0) ? 1 : 0); 
	}
	
}
