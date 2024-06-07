class PalindromePartitioning {
  public static void main(String[] args) {
    
  }

  public static void partition(String string) {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    helper(0, string, path, res);
  }

  public static void helper(int givenIndex, String string, List<String> path, List<List<String>> res) {
    if(index == string.length()) {
      res.add(new ArrayList<>(path));
      return;
    }

    for(int loopIndex = givenIndex; loopIndex < string.length(); ++loopIndex) {
      if(isPalindrome(string, givenIndex, loopIndex)) {
        path.add(string.substring(givenIndex, loopIndex + 1));
        helper(loopIndex + 1, string, path, res);
        path.remove(path.size() - 1);
      }
    }
  }

  public boolean isPalindrome(String string, int start, int end) {
    while(start <= end) {
      if(string.charAt(start++) != string.charAt(end--))  {
        return false;
      }
      return true;
    }
  }

}