@Composable
fun ReplyListOnlyContent(
    replyHomeUIState: ReplyHomeUIState,
) {
    LazyColumn {
        items(replyHomeUIState.emails) { email ->
            ReplyEmailListItem(email = email)
        }
    }
}