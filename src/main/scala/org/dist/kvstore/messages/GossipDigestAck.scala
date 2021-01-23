package org.dist.kvstore.messages

import org.dist.kvstore.{EndPointState, InetAddressAndPort}

case class GossipDigestAck(val digestList: List[GossipDigest],
                           val epStateMap: Map[InetAddressAndPort, EndPointState])