@Composable
fun ReplyApp(
    replyHomeUIState: ReplyHomeUIState,
) {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        ReplyListOnlyContent(replyHomeUIState = replyHomeUIState)
    }
}