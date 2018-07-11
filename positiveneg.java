int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>=1 && a<=100000){
		System.out.println("POSITIVE");
		}
		else if(a<0)
		System.out.println("NEGATIVE");
		else
		System.out.println("ZERO");
