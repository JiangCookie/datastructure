package TopK;

public class TopK {

	public static void main(String[] args) {
		// Դ����
		int[] data = {56,275,12,6,45,478,41,1236,456,12,546,45};
		
		//��ȡtopk
		int[] top5=topk(data,5);
		for(int i=0;i<top5.length;i++){
			System.out.println(top5[i]);
		}

	}
	
	//��data�����л�ȡ����K����
	private static int[] topk(int[] data, int k) {
		int[] topk=new int[k];
		
		// ��ȡK��Ԫ�ط���һ������topk��
		for(int i=0;i<k;i++){
			topk[i]=data[i];
		}
		
		// ת������С��
		MinHeap minHeap=new MinHeap(topk);
		
		// ��k��ʼ������data
		for (int i = k; i < data.length; i++) {
			int root=minHeap.getRoot();
			// �����ݴ��ڶ�����С���������ڵ㣩ʱ���滻���еĸ��ڵ㣬��ת���ɶ�
			if(data[i]>root)
				minHeap.setRoot(data[i]);
		}
			
		return topk;
	}

}
