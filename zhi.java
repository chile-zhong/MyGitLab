List map排序
List:
数值型:
1.Collections.reverse(intList); 原序列的倒叙
2.intList.sort(Comparator.naturalOrder()); 正序
intList.sort(Comparator.reverseOrder()) 倒序
字符型: 
strList.sort(Collator.getInstance(Locale.CHINA)); 正序
strList.sort(Collator.getInstance(Locale.CHINA).reversed()); 倒序
JavaBean类型:

Hashmap的排序:
1.利用List和Collections来实现排序	

2.map.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue()).forEach(System.out::println);
二分
public int search(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
        int mid = lo - (lo - hi) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) lo = mid + 1;
        else if (nums[mid] > target) hi = mid - 1;
    }
    return -1;
}

滑动窗口
public String slideWindow(String s, String t) {
    // 实时记录窗口内的数据 (只存放 need 中需要的字符)
    Map<Character, Integer> window = new HashMap<>();
    // 记录目标字符，始终保持不变
    Map<Character, Integer> need = new HashMap<>();
    // 初始化 need 目标窗口
    // code...
    
    // 左闭右开 [left, right)
    int left = 0, right = 0;
    
    // 存放满足收缩条件的变量
    // valid
    
    while (right < s.length()) {
        // 1. 窗口扩张
        char c = s.charAt(right);
        right++;
        // 2. 更新 valid，window 数据
        if (need.containsKey(c)) {
            // 更新 window
            // code...
            
            // 更新 valid
            if (条件) {
                // code...
            }
        }
        // 根据 valid，来判断是否需要收缩
        while (valid == need.size()) {
            // 1. 判断结果是否需要更新
            // code...
            
            // 2. 窗口收缩
            char d = s.charAt(left);
            left++;
            // 3. 更新 valid，window 数据
            if (need.containsKey(d)) {
                // 更新 valid
                if (条件) {
                    // code...
                }
                
                // 后更新 window
                // code...
            }
        }
    }
    return res;
}

快排

归并
DFS
BFS
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
        int size = q.size();
        List<Integer> list = new ArrayList<>();
        // 完整的一个循环即表示一层
        for (int i = 0; i < size; i++) {
            TreeNode cur = q.poll();
            list.add(cur.val);
            if (cur.left != null) q.offer(cur.left);
            if (cur.right != null) q.offer(cur.right);
        }
        res.add(list);
    }
    return res;
}

位运算
