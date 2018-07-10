package TopK;
/**
 * 
 * @author jiang
 *  TopK����
 */
public class MinHeap {
	//�ѵĴ洢�ṹ -����
	private int[] data;
	
	// ��һ�����鴫�빹�췽������ת����һ��С����
	public MinHeap(int[] data){
		this.data=data;
		buildheap();
	}
	
	//������ת������С��
	private void buildheap() {
		// ��ȫ������ֻ�������±�С�ڻ���� (data.length) / 2 - 1 ��Ԫ���к��ӽ�㣬������Щ���
		// *���������ͼ�У�������10��Ԫ�أ� (data.length) / 2 - 1��ֵΪ4��a[4]�к��ӽ�㣬��a[5]û��*
		for(int i=(data.length)/2-1;i>=0;i--){
			heapify(i);
		}
		
	}

	private void heapify(int i) {
		
		//��ȡ���ҽڵ������±�
		int l=(i<<1)+1;
		int r=l+1;
		
		
		//����һ����ʱ����
		int smallest=i;
		// �������㣬�������ֵС�ڸ�����ֵ
		if(l<data.length&&data[l]<data[i])
			smallest=l;
		// �����ҽ�㣬���ҽ���ֵС�����ϱȽϵĽ�Сֵ
		if(r<data.length&&data[r]<data[smallest])
			smallest=r;
		// ���ҽ���ֵ�����ڸ��ڵ㣬ֱ��return�������κβ���
		if(i==smallest)
			return;
		
		
		//�������ڵ�����������ڵ�����С���Ǹ�ֵ���Ѹ��ڵ��ֵ�滻��ȥ
		swap(i,smallest);
		
		//�����滻�����������ᱻӰ�죬����Ҫ����Ӱ�����������heapify
		heapify(smallest);
	}
	
	//����Ԫ��λ��
	private void swap(int i, int j) {
		int tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
		
	}
	
	//��ȡ��СԪ��
	public  int getRoot(){
		return data[0];
	}
	
	// �滻��Ԫ�أ�������heapify
	public void setRoot(int root) {
		data[0]=root;
		heapify(0);
	}
	
}
