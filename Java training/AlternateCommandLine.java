class AlternateCommandLine{
	public static void main(String args[]){
		int count=0;
		for (int i=0;i<args.length;i++){
		if (count%2==0){
			System.out.println("+"+args[count]);
			count+=1;
		}
		else{
			System.out.println("-"+args[count]);
			count+=1;
		}
		}
}
}
