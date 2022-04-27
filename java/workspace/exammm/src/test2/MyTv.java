package test2;

public class MyTv {
	private boolean isPowerOn;		// �Ŀ�
	private int channel;			// ä��
	private int volume;				// ����
	private int prevChannel; 		// ���� ä��
	
	final int MAX_VOLUME = 100;		// �ִ뺼��
	final int MIN_VOLUME = 0;		// �ּҺ���
	final int MAX_CHANNEL = 100;	// �ִ�ä��
	final int MIN_CHANNEL = 1;		// �ּ�ä��

	public void setVolume(int volume) {
		// 1.volume�� �ִ� �������� ũ��, �ּҺ������� �۰�, �Ŀ��� ���������� ���� ���� �Ұ���  
		// (���뼺 Ȯ���� �ߺ� ������ ȸ���ϱ� ���Ͽ�����ü �ý��� ������ ���� �ý��� ������ ����κ��� �ĺ��Ͽ� �̿� ���� �� ������ �ۼ��� �� �ִ�.5)
		if(volume > MAX_VOLUME || volume < MIN_VOLUME || !this.isPowerOn) {
			 return;}
		
		// 2.�������� volume�� param�� volume �Ҵ�
		// (������ �������Ʈ������ �������� ��ɰ� ������ �����ϱ� ���� ũ��� ���� ����� ������ �� �ִ�.5)
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		// 3.channel�� �ִ� ä�κ��� ũ��, �ּ� ä�κ��� �۰�, �Ŀ��� ���������� ä�� ���� �Ұ���
		// (���뼺 Ȯ���� �ߺ� ������ ȸ���ϱ� ���Ͽ�����ü �ý��� ������ ���� �ý��� ������ ����κ��� �ĺ��Ͽ� �̿� ���� �� ������ �ۼ��� �� �ִ�.5)
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL || !this.isPowerOn) {
			 return;}
		
		// 4.���� ä���� ���� ä�ο� �����Ѵ�.
		// (������ �������Ʈ������ �������� ��ɰ� ������ �����ϱ� ���� ũ��� ���� ����� ������ �� �ִ�.5)
		prevChannel = this.channel;
		
		// 5.�������� channel�� param�� channel �Ҵ�
		// (������ �������Ʈ������ �������� ��ɰ� ������ �����ϱ� ���� ũ��� ���� ����� ������ �� �ִ�.10)
		this.channel = channel;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		// 6.�������� isPowerOn�� param�� isPowerOn �Ҵ�
		// (���뼺 Ȯ���� �ߺ� ������ ȸ���ϱ� ���Ͽ�����ü �ý��� ������ ���� �ý��� ������ ����κ��� �ĺ��Ͽ� �̿� ���� �� ������ �ۼ��� �� �ִ�.10)
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	// 7.���� ü���� ���� ä�η� �����Ѵ�
	// (������ �������Ʈ������ �������� ��ɰ� ������ �����ϱ� ���� ũ��� ���� ����� ������ �� �ִ�.10)
	public void gotoPrevChannel() {
		int temp = this.channel;
		this.channel = prevChannel;
		prevChannel = temp;
		// setChannel(prevChannel) �� �����ε�
	}



	// 8.toString() ����
	// (����Ʈ���� ������ǥ �� ��� ���� ���յ��� ���̰� ���� ������ ���� �������� ���̱� ���� �������� ������ �� �ִ�.10)
	@Override
	public String toString() {
		return "MyTv [isPowerOn=" + isPowerOn + ", channel=" + channel + ", volume=" + volume + ", prevChannel="
				+ prevChannel + ", MAX_VOLUME=" + MAX_VOLUME + ", MIN_VOLUME=" + MIN_VOLUME + ", MAX_CHANNEL="
				+ MAX_CHANNEL + ", MIN_CHANNEL=" + MIN_CHANNEL + "]";
	}	
	
	
}