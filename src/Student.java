
public class Student {
	String name;

	int math;
	int eng;
	int science;
	int social;
	int moral;
	int total;
	int rank;
	float avg;

	public Student() {
		
	}
	

	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setTotal();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setTotal();
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
		setTotal();
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
		setTotal();
	}

	public int getMoral() {
		return moral;
	}

	public void setMoral(int moral) {
		this.moral = moral;
		setTotal();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = math + eng + moral + social + science;
		setAvg();

	}

	public float getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = total / 5.0f;
	}
	
	public String toString() {
		setTotal();
		setAvg();
		String result = "====성 적 표 ====";
		result += "\n이름 : " + getName();
		result += "\n수학 : " + getMath();
		result += "\n영어 : " + getEng();
		result += "\n과학 : " + getScience();
		result += "\n사회 : " + getSocial();
		result += "\n도덕 : " + getMoral();
		result += "\n총점 : " + getTotal();
		result += "\n평균 : " + getAvg();
		result += "\n등수 : " + getRank();
		
		return result;
		
	}

}
