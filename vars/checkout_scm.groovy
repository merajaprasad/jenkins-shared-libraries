def call(String BranchName, String BranchUrl) {
  git branch: "${BranchName}", url: "${BranchUrl}"
}
