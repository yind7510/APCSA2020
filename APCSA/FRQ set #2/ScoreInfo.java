public class ScoreInfo {
	private int score;
	private int numStudents;
	public ScoreInfo(int aScore)
	{
		score = aScore;
		numStudents = 1;
	}
	/** adds 1 to the number of students who earned this score
	*/
	public void increment()
	{ numStudents++; }
	/** @return this score
	*/
	public int getScore()
	{ return score; }
	/** @return the number of students who earned this score
	*/
	public int getFrequency()
	{ return numStudents; }
}
class Stats{
	private ArrayList<ScoreInfo> scoreList;

	//part a
	public boolean record(int score)
	{
		for(int i=0;i<scoreList.size();i++) {
			if(scoreList.get(i).getScore()==score) {
				scoreList.get(i).increment();
				return false;
			}
			else if(score<scoreList.get(i).getScore()) {
				scoreList.add(i,new ScoreInfo(score));
				return true;
			}
		}
		scoreList.add(new ScoreInfo(score));
		return true;
	}
	//part b
	public void recordScores(int[] stuScores)
	{
		for(int score:stuScores) { 
			record(score);
		}
	}

}
