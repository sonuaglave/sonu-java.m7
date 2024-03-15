class Population
{
   public static void main (String[]args)
   {
     double oneSecondBirtheEveryYear=365*24*60*60;
     double currentPopulation=312032486;
     double birthEvery7second=(oneSecondBirtheEveryYear/7)*5;
     double deathEvery13Second=(oneSecondBirtheEveryYear/13)*5;
     double newImmigrantEvery45Second=(oneSecondBirtheEveryYear/45)*5;
     double nextFiveYearPopulation=currentPopulation+(oneSecondBirtheEveryYear+birthEvery7second-deathEvery13Second+newImmigrantEvery45Second)*5;
     
     System.out.println("nextFiveYearPopulation-"+nextFiveYearPopulation);
     System.out.println("currentPopulation="+currentPopulation);
     
    

   }
}