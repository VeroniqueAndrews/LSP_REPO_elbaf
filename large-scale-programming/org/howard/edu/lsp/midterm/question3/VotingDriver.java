public static void main(String[] args) {
    VotingDriver vm = new VotingDriver();
    vm.addCandidate("Alsobrooks");
    vm.castVote("Alsobrooks");  
    vm.addCandidate("Hogan");
    System.out.println(vm.toString());  
}
